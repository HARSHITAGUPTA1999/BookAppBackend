package com.backend.bookApp.services;

import java.util.List;

import com.backend.bookApp.models.Books;
import com.backend.bookApp.models.Favourites;

public interface FavouriteService {
	
	public Favourites createWishlist(Favourites favourite);
	
	public List<Favourites> readWishList(int userId); 

	//creating a favourite for a user id
	public Favourites createFavourite(Favourites favourite, int userId, int bookId);

	
	public List<Favourites> getAllFavourite();
	
	public List<Favourites> getFavouriteByUser(int userId);
	

}
