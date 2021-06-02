package com.javatechie.spring.swagger.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue
	private int bookId;
	private String bookName;
	private int price;

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + ", getBookId()=" + getBookId()
				+ ", getBookName()=" + getBookName() + ", getPrice()=" + getPrice() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Book(int bookId, String bookName, int price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
