package com.example.order.domain;

import java.util.List;
import java.util.Objects;

public class Book {
	
	private final int isbn;
	private final String title;
	private final String author;
	private final String publisher;
	private final int edition;
	private final int publicationYear;
	private final int price;
	private final int reviews;
	private final String contents;
	private final byte[] coverPhoto;
	private final int popularity;
	private final String category;
	
	public Book(int isbn, String title, String author, String publisher, int edition, int publicationYear, int price,
			int reviews, String contents, byte[] coverPhoto, int popularity, String category) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.edition = edition;
		this.publicationYear = publicationYear;
		this.price = price;
		this.reviews = reviews;
		this.contents = contents;
		this.coverPhoto = coverPhoto;
		this.popularity = popularity;
		this.category = category;
	}

	public int getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getEdition() {
		return edition;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public int getPrice() {
		return price;
	}

	public int getReviews() {
		return reviews;
	}

	public String getContents() {
		return contents;
	}

	public byte[] getCoverPhoto() {
		return coverPhoto;
	}

	public int getPopularity() {
		return popularity;
	}

	public String getCategory() {
		return category;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return isbn == other.isbn;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publicationYear=" + publicationYear + "]";
	}

	
}
