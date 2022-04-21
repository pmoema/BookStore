package com.bookshop.api;

import java.util.List;
import java.util.ArrayList;

public class BookOrderResponse {
	
	private List<BookOrderDto> bookOrders = new ArrayList<>();

	public List<BookOrderDto> getBookOrders() {
		return bookOrders;
	}

	public void setBookOrders(List<BookOrderDto> bookOrders) {
		this.bookOrders = bookOrders;
	}
}
