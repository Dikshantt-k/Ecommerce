package com.example.eCommerce.service;

import java.util.List;

import com.example.eCommerce.entity.Users;

public interface UserService {

	public List<Users> getAllUsers() ;

	public Users saveUser(Users users);

}
