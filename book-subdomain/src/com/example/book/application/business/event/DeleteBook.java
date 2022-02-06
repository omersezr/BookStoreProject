package com.example.book.application.business.event;

import com.example.book.domain.Book;

public class DeleteBook extends BookEvent {
    private final Book book;

    public DeleteBook(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }
}
