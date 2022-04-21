package com.bookshop.service;

import java.util.List;

import com.bookshop.api.BookOrderDto;

public interface BookService {

	void createBookOrder(BookOrderDto bookOrder);

	List<BookOrderDto> getBookOrders();


}
