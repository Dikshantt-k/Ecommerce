package com.example.eCommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eCommerce.dto.UserDto;
import com.example.eCommerce.entity.Cart;
import com.example.eCommerce.entity.CartItem;
import com.example.eCommerce.entity.Users;
import com.example.eCommerce.repository.CartItemRepository;
import com.example.eCommerce.repository.CartRepository;
import com.example.eCommerce.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	public UserRepository userRepository;
	
	@Autowired
	public CartRepository cartRepository;
	
	@Autowired
	public CartItemRepository cartItemRepository;
	
	@Override
	public UserDto registerUser(Users users) {
		// TODO Auto-generated method stub
		Cart cart = new Cart();
		Users u = new Users();
		u.setUserId(users.getUserId());
		u.setUserName(users.getUserName());
		u.setEmailId(users.getEmailId());
		u.setPassword(users.getPassword());
		u.setCart(cart);
		cart.setUser(u);
		Users saveUser= userRepository.save(u);
		
		cartRepository.save(cart);
		
		UserDto userDto = new UserDto();
		userDto.setUserId(saveUser.getUserId());
		userDto.setUserName(saveUser.getUserName());
		userDto.setEmailId(saveUser.getEmailId());
		userDto.setPassword(saveUser.getPassword());
		
		return userDto;
	}

	@Override
	public List<Users> getAllUsers() {
		
		return userRepository.findAll();
	}

	@Override
	public void deleteUserById(int userId) {
		Users user =userRepository.findById(userId).get();
		int cartId =user.getCart().getCartId();
		userRepository.delete(user);
		cartItemRepository.deleteByCartCartId(cartId);
		cartRepository.deleteById(cartId);
		
	}

}

