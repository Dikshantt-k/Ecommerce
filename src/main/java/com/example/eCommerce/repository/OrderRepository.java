package com.example.eCommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eCommerce.entity.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer>{

}
