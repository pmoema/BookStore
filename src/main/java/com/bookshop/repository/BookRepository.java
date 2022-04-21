package com.bookshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookshop.entity.BookOrder;

public interface BookRepository extends JpaRepository<BookOrder, Long> {

}
