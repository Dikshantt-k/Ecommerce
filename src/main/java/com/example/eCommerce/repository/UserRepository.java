package com.example.eCommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eCommerce.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer>{

}
