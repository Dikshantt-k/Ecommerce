package com.example.eCommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.eCommerce.entity.Users;
import com.example.eCommerce.service.UserService;
import com.example.eCommerce.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	public UserService userService;
	
	@PostMapping("/save")
	public Users saveUser(@RequestBody Users users) {
		
		return 	userService.saveUser(users);
		
	}
	
	@GetMapping("/getall")
	public List<Users> getAllUsers(){
		return userService.getAllUsers();
	}
}
