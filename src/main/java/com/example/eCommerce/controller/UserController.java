package com.example.eCommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.eCommerce.dto.UserDto;
import com.example.eCommerce.entity.Users;
import com.example.eCommerce.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	public UserService userService;
	
	@PostMapping("/save")
	public ResponseEntity<UserDto> saveUser(@RequestBody Users users) {
		UserDto user=userService.registerUser(users);
		return new ResponseEntity<>(user,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getall")
	public ResponseEntity< List<Users>> getAllUsers(){
		List<Users> user = userService.getAllUsers();
		return new ResponseEntity<>(user,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<String> deleteUserById(@PathVariable int userId){
		userService.deleteUserById(userId);
		return ResponseEntity.ok("User Delete Successfully");
	}
}
