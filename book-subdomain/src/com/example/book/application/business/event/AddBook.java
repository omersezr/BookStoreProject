package com.example.book.application.business.event;

import com.example.book.domain.Book;

public class AddBook extends BookEvent{

	private final Book book;

	public AddBook(Book book) {
        this.book = book;
    }

	public Book getBook() {
		return book;
	}

}
