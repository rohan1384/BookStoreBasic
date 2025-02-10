package com.book.service;

import java.util.List;


import com.book.model.Book;
import com.book.model.User;

public interface Service {
   
	public Book savBook(Book book);
	
	public List<Book>getAllBook();
	
	public Book editBook(Book book , Integer bookId);
	
	public Book getBookById(Integer bookId);
	
	public String deleteBook(Integer bookId);

    public User registerUser(User user);
    
    public String loginUser(User user);
   
}
