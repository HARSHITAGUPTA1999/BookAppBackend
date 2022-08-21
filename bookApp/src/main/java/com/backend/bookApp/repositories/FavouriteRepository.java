package com.backend.bookApp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.backend.bookApp.models.Favourites;
import com.backend.bookApp.models.Users;

@Repository
public interface FavouriteRepository extends JpaRepository<Favourites, Integer>{
	
	//get all favorites by given userid
	public List<Favourites> findAllByUserId(int userId);
	
	
	


}
