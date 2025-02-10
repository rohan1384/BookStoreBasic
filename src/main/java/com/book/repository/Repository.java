package com.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.model.Book;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Book, Integer> {
	 
	

}
