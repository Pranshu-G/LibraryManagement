package com.example.trg.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

	
	public Book() {

	}
	@Id
	int bookid;
	String title;
	@Column(length=15)
	String  subject;
	double price;
	Integer issuedTo;
	
	public Book(int bookid, String title, String subject, double price, Integer issuedTo) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.subject = subject;
		this.price = price;
		this.issuedTo = issuedTo;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getIssuedTo() {
		return issuedTo;
	}

	public void setIssuedTo(Integer issuedTo) {
		this.issuedTo = issuedTo;
	}
	
	
	
}
