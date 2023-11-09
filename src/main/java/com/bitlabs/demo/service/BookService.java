package com.bitlabs.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitlabs.demo.model.Book;
import com.bitlabs.demo.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepo;
	
	public String addBook(Book book) {
		Book book1=bookRepo.save(book);
		
		if(book1!=null)
		  return "Registerd book Sucessfully";
		return "something went wrong";
		
	}
	
	public String deleteBook(Book book) {
		try {
		bookRepo.delete(book);
		}
		catch(Exception e) {
			return e.getMessage();
		}
		return "deleted successfully";
		
	}
	
	public List<Book> getAll(){
		List<Book> books=bookRepo.findAll();
		return books;
	}
	
	public String deleteBookById(int id) {
		bookRepo.deleteById(id);
		return "deleted successfully";
		
	}
}
