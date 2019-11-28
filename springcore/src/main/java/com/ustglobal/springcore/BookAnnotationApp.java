package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.ConfigurationBook;
import com.ustglobal.springcore.di.Book;

public class BookAnnotationApp {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationBook.class);
		Book book = context.getBean(Book.class);
		System.out.println(book.getAuthor().getName());
		System.out.println(book.getAuthor().getPenName());
		System.out.println(book.getName());
		System.out.println(book.getPrice());
		
	}

}
