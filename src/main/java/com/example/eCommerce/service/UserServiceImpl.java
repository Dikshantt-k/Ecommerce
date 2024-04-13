package com.example.eCommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eCommerce.entity.Users;
import com.example.eCommerce.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	public UserRepository userRepository;
	
	@Override
	public Users saveUser(Users users) {
		// TODO Auto-generated method stub
		return userRepository.save(users) ;
	}

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
