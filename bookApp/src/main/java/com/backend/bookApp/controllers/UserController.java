package com.backend.bookApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.backend.bookApp.models.Users;
import com.backend.bookApp.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userServ;
	
	
	
	@GetMapping("/all-users")
	public List<Users> getAllUsers() {
		return userServ.getAllUsers();
	}
	
	@GetMapping("/all-users/{uId}")
	public Users getOneUser(@PathVariable("uId") int userId){
		return userServ.getOneUser(userId);
	}
	
	@PostMapping("/all-users")
	public Users addUsers(@RequestBody Users user){
		return userServ.addUser(user);
	}
	
	@PutMapping("/all-users/{uId}")
	public Users updateUsers(@RequestBody Users user, @PathVariable("uId") int userId){
		return userServ.updateUser(user, userId);
	}
	
	@DeleteMapping("/all-users/{uId}")
	public String deleteUsers(@PathVariable("uId") int userId){
		return userServ.deleteUser(userId);
	}
	
	
	
	
	
	
	
	
	
	

}
