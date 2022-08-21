package com.backend.bookApp.services;







import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.bookApp.models.Books;
import com.backend.bookApp.models.Favourites;
import com.backend.bookApp.models.Users;
import com.backend.bookApp.repositories.BookRepository;
import com.backend.bookApp.repositories.FavouriteRepository;
import com.backend.bookApp.repositories.UserRepository;



@Service
//@Transactional
public class FavouriteServiceImpl implements FavouriteService {
	
	@Autowired
	FavouriteRepository favRepo;
	@Autowired
	UserRepository userRepo;
	@Autowired
	BookRepository bookRepo;
	
	@Override
	public Favourites createWishlist(Favourites favourite) {
		
		return this.favRepo.save(favourite);
	    }
	 
	 @Override
	public List<Favourites> readWishList(int userId) {
	        return favRepo.findAllByUserId(userId);
	    }

	@Override
	public Favourites createFavourite(Favourites favourite, int userId, int bookId) {
		Users user = userRepo.findById(userId).get();
		Books book = bookRepo.findById(bookId).get();
		favourite.setUser(user);
		favourite.setBook(book);
		return this.favRepo.save(favourite);
	}

	@Override
	public List<Favourites> getAllFavourite() {
		return favRepo.findAll();
	}

	@Override
	public List<Favourites> getFavouriteByUser(int userId) {
		return favRepo.findAllByUserId(userId);
	}


	

	


}
