package com.bookshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookshop.api.BookOrderDto;
import com.bookshop.api.BookOrderResponse;
import com.bookshop.service.BookService;


@RestController
@RequestMapping(path = "/")
public class BookController {
	
	private BookService bookService;
	
	
	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@PostMapping(path = "/create-order")
	public ResponseEntity createOrder(@RequestBody BookOrderDto bookOrder) {
		
		bookService.createBookOrder(bookOrder);

		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@GetMapping(path = "/bookorders")
	public BookOrderResponse getBookOrders() {
		
		BookOrderResponse bookOrderResponse = new BookOrderResponse();
		bookOrderResponse.setBookOrders(bookService.getBookOrders());
		
		return bookOrderResponse;
	}

}
