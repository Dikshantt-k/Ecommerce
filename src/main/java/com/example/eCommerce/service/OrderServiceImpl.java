package com.example.eCommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.jaxb.SpringDataJaxb.OrderDto;
import org.springframework.stereotype.Service;

import com.example.eCommerce.dto.OrderItemDto;
import com.example.eCommerce.dto.OrdersDto;
import com.example.eCommerce.entity.Cart;
import com.example.eCommerce.entity.CartItem;
import com.example.eCommerce.entity.Orders;
import com.example.eCommerce.entity.Product;
import com.example.eCommerce.entity.OrderItem;
import com.example.eCommerce.entity.Users;
import com.example.eCommerce.repository.CartItemRepository;
import com.example.eCommerce.repository.CartRepository;
import com.example.eCommerce.repository.OrderItemRepository;
import com.example.eCommerce.repository.OrderRepository;
import com.example.eCommerce.repository.ProductRepository;
import com.example.eCommerce.repository.UserRepository;

@Service
public class OrderServiceImpl  implements OrderService{
	
	@Autowired
	public CartRepository cartRepository;
	
	@Autowired
	public CartItemRepository cartItemRepository;
	
	@Autowired
	public OrderRepository orderRepository;
	
	@Autowired
	public UserRepository userRepository;
	
	@Autowired
	public OrderItemRepository orderItemRepository;
	
	@Autowired
	public ProductRepository productRepository;
	@Override
	public OrdersDto placeOrder(int userId) {
		
		Users user = userRepository.findById(userId).get();
		Cart cart = cartRepository.findByUserUserId(userId);
		List<CartItem> cartItem =cart.getCartItem();
		Orders order = new Orders();
		List<OrderItem> orderItem = new ArrayList<>();
		Double total=0.0;
		
		for(CartItem c: cartItem) {
			OrderItem oi = new OrderItem();
						oi.setPrice(c.getProduct().getPrice());
						oi.setProduct(c.getProduct());
						oi.setQuantity(c.getQuantity());
						oi.setOrder(order);
						total=total+c.getProduct().getPrice();
			orderItem.add(oi);
		}
		
		List<Product> products=new ArrayList<Product>();
		
		for(CartItem ci : cartItem) {
			Product product = ci.getProduct();
					product.setQuantity(product.getQuantity()-ci.getQuantity());
					products.add(product);
						
		}
		
		order.setOrderItem(orderItem);
		order.setTotalPrice(cart.getTotalPrice());
		order.setUserName(user.getUserName());
		order.setStatus("Order Has Been placed!!");
		
		orderRepository.save(order);
		orderItemRepository.saveAll(orderItem);
		cart.setTotalPrice(cart.getTotalPrice()-total);
		cartRepository.save(cart);
		cartItemRepository.deleteAll(cartItem);
		productRepository.saveAll(products);
		
		OrdersDto orderdto = new OrdersDto();
		orderdto.setOrdersId(order.getOrderId());
		orderdto.setEmailId(user.getEmailId());
		orderdto.setTotalprice(order.getTotalPrice());
		orderdto.setOrderStatus(order.getStatus());
		
		List<OrderItemDto> orderItems = new ArrayList<OrderItemDto>();
		for(OrderItem oi:orderItem) {
			OrderItemDto oid = new OrderItemDto();
						oid.setOrderItemId(oi.getOrderItemId());
						oid.setProductName(oi.getProduct().getProductName());
						oid.setQuantity(oi.getQuantity());
						oid.setPrice(oi.getPrice());
						orderItems.add(oid);
		}
		
		orderdto.setOrderItem(orderItems);
		return orderdto;
	}
	@Override
	public String ratePurchesProduct(int ordersId, int productId) {
		Orders order = orderRepository.findById(ordersId).get();
		OrderItem orderItem = orderItemRepository.findByProductProductId(productId);
		Product product = productRepository.findById(productId).get();
		product.setAvgRating(product.getAvgRating());
		return null;
	}

}
