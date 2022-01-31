package com.example.book.domain;

import java.util.List;
import java.util.Objects;

public class Book {
	
	private String isbn;
	private Title title;
	private Author author;
	private Publisher publisher;
	private Edition edition;
	private PublicationYear publicationYear;
	private Price price;
	private Reviews reviews;
	private Content contents;
	private CoverPhoto coverPhoto;
	private Popularity popularity;
	private List<Category> category;
	
	public Book(String isbn, Title title, Author author, Publisher publisher, Edition edition,
			PublicationYear publicationYear, Price price, Reviews reviews, Content contents, CoverPhoto coverPhoto,
			Popularity popularity, List<Category> category) {
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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Edition getEdition() {
		return edition;
	}

	public void setEdition(Edition edition) {
		this.edition = edition;
	}

	public PublicationYear getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(PublicationYear publicationYear) {
		this.publicationYear = publicationYear;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public Reviews getReviews() {
		return reviews;
	}

	public void setReviews(Reviews reviews) {
		this.reviews = reviews;
	}

	public Content getContent() {
		return contents;
	}

	public void setContent(Content contents) {
		this.contents = contents;
	}

	public CoverPhoto getCoverPhoto() {
		return coverPhoto;
	}

	public void setCoverPhoto(CoverPhoto coverPhoto) {
		this.coverPhoto = coverPhoto;
	}

	public Popularity getPopularity() {
		return popularity;
	}

	public void setPopularity(Popularity popularity) {
		this.popularity = popularity;
	}

	public List<Category> getCategory() {
		return category;
	}

	public void setCategory(List<Category> category) {
		this.category = category;
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
		return Objects.equals(isbn, other.isbn);
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + "]";
	}
	
}
