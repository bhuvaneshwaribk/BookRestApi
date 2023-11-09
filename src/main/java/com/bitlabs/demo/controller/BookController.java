package com.bitlabs.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitlabs.demo.model.Book;
import com.bitlabs.demo.service.BookService;

@RestController
@RequestMapping("/bookService")
public class BookController {

	
	@Autowired
	private BookService bookservice;
	
	@PostMapping("/addBook")
	public String registerBook(@RequestBody Book book) {
		String result=bookservice.addBook(book);
		return result;	
	}
	
	@DeleteMapping("/deleteBook")
	public String removeBook(@RequestBody Book book) {
		String result=bookservice.deleteBook(book);
		return result;
	}
	
	@GetMapping("/getAll")
	public List<Book> getAllBook(){
		List<Book> books=bookservice.getAll();
		return books;
		
	}
	
	 @DeleteMapping("/deleteBookById/{id}")
	   public String deleteBookById(@PathVariable Integer id ) {
		   String result=bookservice.deleteBookById(id);
		return result;   
	   }
}
