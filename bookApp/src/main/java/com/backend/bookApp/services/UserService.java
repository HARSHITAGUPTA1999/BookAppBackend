package com.backend.bookApp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.backend.bookApp.models.Books;
import com.backend.bookApp.models.Users;

@Service
public interface UserService {

	public List<Users> getAllUsers();
	
	public Users getOneUser(int userId);
	
	public Users addUser(Users user);
	
	public Users updateUser(Users user, int userId);
	
	public String deleteUser(int userId);
}
