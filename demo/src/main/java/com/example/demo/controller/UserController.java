package com.example.demo.controller;
import com.example.demo.model.User;
import java.util.List;

public class UserController {
	private UserService userService;
	
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
}
