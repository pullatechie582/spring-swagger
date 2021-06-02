package com.javatechie.spring.swagger.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.spring.swagger.api.model.Book;
import com.javatechie.spring.swagger.api.service.BookService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping ("/book")
@Api (value = "Book Store", description = "My Book Store")
public class BookController {
	
	@Autowired
	private BookService service;
	
	@PostMapping ("/save")
	@ApiOperation (value = "Store Book Api")
	public String saveBook(@RequestBody Book book) {
		return service.saveBook(book);
	}
	
	@GetMapping ("/searchBook/{bookId}")
	@ApiOperation (value = "Searching Book Api")
		public Book getBook(@PathVariable int bookId) {
		return service.getBook(bookId);	
	}
	
	@DeleteMapping ("/deleteBook/{bookId}")
	@ApiOperation (value = "Delete Book Api")
	public List<Book> deletBook(@PathVariable int bookId){
		return service.deleteBook(bookId);
	}

}
