package com.bookshop.api;

public class BookOrderDto {
	
	private String isbn;
	
	private Integer quantity;

	public BookOrderDto(String isbn, Integer quantity) {
		super();
		this.isbn = isbn;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}
