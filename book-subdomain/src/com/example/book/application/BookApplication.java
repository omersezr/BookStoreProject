package com.example.book.application;

import java.util.Optional;

import com.example.book.domain.Book;
import com.example.book.domain.Isbn;

public interface BookApplication {
	Book addBook(Book book);

	Book deleBook(Isbn isbn);

	Optional<Book> findBookByIsbn(Isbn isbn);

	Book updateBook(Book book);

}
