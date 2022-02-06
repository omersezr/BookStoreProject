package com.example.book.application.business;

import java.util.Optional;

import com.example.book.application.BookApplication;
import com.example.book.application.business.event.AddBook;
import com.example.book.application.business.event.DeleteBook;
import com.example.book.application.business.event.UpdateBook;
import com.example.book.application.business.exception.BookNotFoundException;
import com.example.book.application.business.exception.ExistingBookException;
import com.example.book.domain.Book;
import com.example.book.domain.Isbn;
import com.example.book.infra.EventPublisher;
import com.example.book.repository.BookRepository;

public class StandardBookApplication implements BookApplication {
	private BookRepository bookRepository;
	private EventPublisher eventPublisher;

	public StandardBookApplication(BookRepository bookRepository, EventPublisher eventPublisher) {
		this.bookRepository = bookRepository;
		this.eventPublisher = eventPublisher;
	}

	@Override
	public Book addBook(Book book) {
		var no = book.getIsbn();
		if (bookRepository.existsByIsbn(no)) {
			throw new ExistingBookException("Book already exist", no.getValue());
		}
		Book addBook = bookRepository.add(book);
		var businessEvent = new AddBook(addBook);
		eventPublisher.publishEvent(businessEvent);
		return addBook;
	}

	@Override
	public Book deleBook(Isbn isbn) {
		Optional<Book> deleteBook = bookRepository.delete(isbn);
		var book = deleteBook.orElseThrow(() -> new BookNotFoundException("Book does not exist", isbn.getValue()));
		eventPublisher.publishEvent(new DeleteBook(book));
		return book;
	}

	@Override
	public Optional<Book> findBookByIsbn(Isbn isbn) {
		return bookRepository.findBookByIsbn(isbn);
	}

	@Override
	public Book updateBook(Book book) {
		var no = book.getIsbn();
		if (!bookRepository.existsByIsbn(no)) {
			throw new BookNotFoundException("Book does not exist", no.getValue());
		}
		Book update = bookRepository.update(book);
		var businessEvent = new UpdateBook(update);
		eventPublisher.publishEvent(businessEvent);
		return update;
	}
}