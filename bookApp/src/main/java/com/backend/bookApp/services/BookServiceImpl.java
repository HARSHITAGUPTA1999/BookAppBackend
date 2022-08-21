package com.backend.bookApp.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.bookApp.models.Books;
import com.backend.bookApp.repositories.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	//business logic to get all the books
	//ask the repository layer to help with crud opertaions logic
	
	@Autowired
	//create object of book repo
	BookRepository bookRepo;
	

	@Override
	public List<Books> getAllBooks() {
		return bookRepo.findAll();
	}


	@Override
	public Books addBook(Books book) {
		return bookRepo.save(book);
	}


	@Override
	public Books updateBook(Books book, int bookId) {
		return bookRepo.save(book);
	}


	@Override
	public String deleteBook(int bookId) {
	    bookRepo.deleteById(bookId);
		return "Book is deleted successfully";
	}
	
	@Override
	public Books getOneBook(int bookId) {
	    return bookRepo.findById(bookId).get();
	}

}
