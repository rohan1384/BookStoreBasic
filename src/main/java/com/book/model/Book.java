package com.book.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Book {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookid;
	private String bookName ;
	private String bookauthor;
	private  Integer bookprice;
	private Integer available;
	
	

}
