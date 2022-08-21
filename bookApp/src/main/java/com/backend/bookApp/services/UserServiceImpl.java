package com.backend.bookApp.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.bookApp.models.Books;
import com.backend.bookApp.models.Users;
import com.backend.bookApp.repositories.BookRepository;
import com.backend.bookApp.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepo;
	

	@Override
	public List<Users> getAllUsers() {
		return userRepo.findAll();
	}

    @Override
	public Users addUser(Users user) {
		return userRepo.save(user);
	}


	@Override
	public Users updateUser(Users user, int userId) {
		return userRepo.save(user);
	}


	@Override
	public String deleteUser(int userId) {
	    userRepo.deleteById(userId);
		return "User is deleted successfully";
	}
	
	@Override
	public Users getOneUser(int userId) {
	   return userRepo.findById(userId).get();
	}


	
}
