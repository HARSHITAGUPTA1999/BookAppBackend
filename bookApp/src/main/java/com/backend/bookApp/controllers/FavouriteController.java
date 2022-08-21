package com.backend.bookApp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.bookApp.models.Books;
import com.backend.bookApp.models.Favourites;
import com.backend.bookApp.models.Users;
import com.backend.bookApp.services.FavouriteService;
import com.backend.bookApp.services.UserService;




@RestController
public class FavouriteController {
	
	@Autowired
	FavouriteService favServ;
	
	@Autowired
	UserService userServ;
	
	 @GetMapping("/favourites/user/{uId}")
     public List<Books> getWishList(@PathVariable("uId") int userId) {
             
             List<Favourites> body = favServ.readWishList(userId);
             List<Books> books = new ArrayList<Books>();
             for (Favourites fav : body) {
                     books.add(fav.getBook());
             }

             return books;
             
             
     }

//     @PostMapping("/favourites/user/{uId}/books/{bId}")
//     public Favourites addWishList(@RequestBody Books book, @PathVariable("uId") int userId, @PathVariable("bId") int bookId) {
//             
//    	 Users user = userServ.getOneUser(userId);  
//    	 Favourites favourite = new Favourites(user, book);
//    	 return favServ.createWishlist(favourite);
//
//     }
	
	// add favourite for a given user
	@PostMapping("/favourites/user/{uId}/books/{bId}")
	public Favourites addToFav(@RequestBody Favourites favourite , @PathVariable("uId") int userId, @PathVariable("bId") int bookId) {
		
		return favServ.createFavourite(favourite, userId, bookId);
	}
	
	@GetMapping("/all-favourites")
	public List<Favourites> getAllFavourites(){
		return favServ.getAllFavourite();
	}
	
	@GetMapping("/all-favourites/user/{uId}")
	public List<Favourites> getFavouritesByUsers(@PathVariable("uId") int userId){
		return favServ.getFavouriteByUser(userId);
	}
	
//	@DeleteMapping("/favourites/user/{uId}/books/{bId}")
//	public String deleteFavouritesByUsers(@PathVariable("uId") int userId, @PathVariable("bId") int bookId){
//		return favServ.deleteFavouriteByUser(userId, bookId);
//	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	

}
