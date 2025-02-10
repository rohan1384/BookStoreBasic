package com.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.book.model.Book;
import com.book.model.User;
import com.book.repository.Repository;
import com.book.repository.UserRepo;


@org.springframework.stereotype.Service
public class ServiceIMPL implements Service {

	  @Autowired
	private Repository repository;
	  
	  @Autowired
	    private UserRepo userRepository;

	  

	@Override
	public Book savBook(Book book) {
       Book newBook=repository.save(book);
       
		return newBook;
	}

	@Override
	public List<Book> getAllBook() {
		
		List<Book> allBooks=repository.findAll();
		return allBooks;
	}

	@Override
	public Book editBook(Book book, Integer bookId) {
		
		Book oldBook=repository.findById(bookId).get();
		   oldBook.setBookName(book.getBookName());
		   oldBook.setBookauthor(book.getBookauthor());
		   oldBook.setBookprice(book.getBookprice());
		   oldBook.setAvailable(book.getAvailable());
		
		return repository.save(oldBook);
	}

	@Override
	public Book getBookById(Integer bookId) {
		Book book1=repository.findById(bookId).get();
		
		return book1;
	}

	@Override
	public String deleteBook(Integer bookId) {
		
		Book deleteBook=repository.findById(bookId).get();
		
		  if(deleteBook!=null) {
			  repository.deleteById(bookId);
			  return "Product deleted Sucessfully";
		   }
		   
		   return "Something went Wrong";
		
	}

	@Override
	public User registerUser(User user) {
		

        return userRepository.save(user);
	}

	@Override
	public String loginUser(User user) {
		
		User olduser=userRepository.findByEmail(user.getEmail());
		
		
		
		 if( olduser.getPassword().equals(olduser.getPassword())) {
			 return "User Found";
			 
		 }
		 else {
			 return "No User";
		 }
	}
 
	 
	
	  
	  
	  
}
