package com.book.controller;

import org.hibernate.sql.ast.tree.expression.NestedColumnReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.book.model.Book;
import com.book.model.User;
import com.book.service.Service;

import jakarta.validation.Valid;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class Controller {
	 @Autowired
	  private Service service;
	
	 @PostMapping("/save")
	 public ResponseEntity<?>SaveBook(@RequestBody Book book){
		 
		 return new ResponseEntity<>(service.savBook(book),HttpStatus.OK);
	 }
	 
	  @GetMapping("/getAll")
	 public ResponseEntity<?>getAllBook(){
		 
		  return new ResponseEntity<>(service.getAllBook(),HttpStatus.OK);
	 }
	  
	   @GetMapping("/get/{id}")
	  public ResponseEntity<?>getBookById(@PathVariable Integer id){
		  
		   return new ResponseEntity<>(service.getBookById(id),HttpStatus.OK);
	  }
	   
	   
	   @PutMapping("/edit/{id}")
	   public ResponseEntity<?>editBook(@RequestBody Book book,@PathVariable Integer id){
		   
		   return new ResponseEntity<>(service.editBook(book, id),HttpStatus.OK);
	   }
	   
	   
	   @DeleteMapping("/delete/{id}")
	   public ResponseEntity<?>deleteBook(@PathVariable Integer id){
		   
		   return new ResponseEntity<>(service.deleteBook(id),HttpStatus.OK);
	   }
	   
	   @PostMapping("/register")
	    public ResponseEntity<?> register( @RequestBody User user) {
	       
	        return new ResponseEntity<>(service.registerUser(user),HttpStatus.OK);
	    }
	   
	   
	   @PostMapping("/login")
	   public ResponseEntity<?>login(@RequestBody User user){
		   
		   return new ResponseEntity<>(service.loginUser(user),HttpStatus.OK);
	   }

	  
}
