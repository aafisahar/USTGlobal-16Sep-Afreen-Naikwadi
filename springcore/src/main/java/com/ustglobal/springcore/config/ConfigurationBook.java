package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;

public class ConfigurationBook {

	@Bean(name="book")
	public Book getBook() {
		Book book = new Book();
		book.setName("Java");
		book.setPrice(2000.67);
		return book;
	}
	
	@Bean(name="author")
	public Author getAuthor() {
		Author auth = new Author();
		auth.setName("Deepesh");
		auth.setPenName("Conway Stewart Westminster Teal");
		return auth;
	}
}
