package com.bookshop.service;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookshop.api.BookOrderDto;
import com.bookshop.entity.BookOrder;
import com.bookshop.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	private BookRepository bookRepository;
	
	@Autowired
	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public void createBookOrder(BookOrderDto bookOrder) {
		BookOrder book = new BookOrder();
		bookRepository.save(book);
	}

	@Override
	public List<BookOrderDto> getBookOrders() {
		List<BookOrder> bookOrders = bookRepository.findAll();
		List<BookOrderDto> bookOrdersList = new ArrayList<>();
		bookOrders.forEach(bk -> bookOrdersList.add(new BookOrderDto(bk.getIsbn(), bk.getQuantity())));
		return bookOrdersList;
	}

}
