package com.example.book.application.business.event;

import com.example.book.domain.Book;

public class UpdateBook extends BookEvent {
    private final Book book;

    public UpdateBook(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }
}
