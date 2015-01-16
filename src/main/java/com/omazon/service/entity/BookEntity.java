package com.omazon.service.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BookEntity {

	@Column(name="book_author")
	private String book_author;
	@Column(name="publisher")
	private String publisher;
	@Column(name="isbn")
	private String isbn;
	
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
}
