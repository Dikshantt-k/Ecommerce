package com.example.eCommerce.service;

import java.util.List;

import com.example.eCommerce.dto.UserDto;
import com.example.eCommerce.entity.Users;

public interface UserService {

	public List<Users> getAllUsers() ;

	public UserDto registerUser(Users users);

	public void deleteUserById(int userId);

}
