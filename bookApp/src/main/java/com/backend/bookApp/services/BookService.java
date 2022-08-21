package com.backend.bookApp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.backend.bookApp.models.Books;

@Service
public interface BookService {

	public List<Books> getAllBooks();
	
	public Books getOneBook(int bookId);
	
	public Books addBook(Books book);
	
	public Books updateBook(Books book, int bookId);
	
	public String deleteBook(int bookId);
}
