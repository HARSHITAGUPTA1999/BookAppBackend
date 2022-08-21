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

import com.backend.bookApp.models.Books;
import com.backend.bookApp.services.BookService;

@RestController
public class BookController {
	
	@Autowired
	//object of service layer
	BookService bookServ;
	
	
	
	@GetMapping("/admin/all-books")
	public List<Books> getAllBooks() {
		
		//will ask the service layer to get all the books
		return bookServ.getAllBooks();
	}
	
	@GetMapping("/admin/all-books/{bId}")
	public Books getOneBook(@PathVariable("bId") int bookId){
		
		//will ask the service layer to get the book with given id
		return bookServ.getOneBook(bookId);
	}
	
	@PostMapping("/admin/all-books")
	public Books addBooks(@RequestBody Books book){
		
		//will ask the service layer to add book to db
		return bookServ.addBook(book);
	}
	
	@PutMapping("/admin/all-books/{bId}")
	public Books updateBooks(@RequestBody Books book, @PathVariable("bId") int bookId){
		
		//will ask the service layer to update book with given id
		return bookServ.updateBook(book, bookId);
	}
	
	@DeleteMapping("/admin/all-books/{bId}")
	public String deleteBooks(@PathVariable("bId") int bookId){
		
		//will ask the service layer to delete the book with given id
		return bookServ.deleteBook(bookId);
	}
	
	
	
	
	
	
	
	
	
	

}
