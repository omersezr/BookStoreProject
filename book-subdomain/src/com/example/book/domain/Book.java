package com.example.book.domain;

import java.util.List;
import java.util.Objects;

public class Book {

	private final Isbn isbn;
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
	private Category category;

	public Book(Isbn isbn, Title title, Author author, Publisher publisher, Edition edition,
			PublicationYear publicationYear, Price price, Reviews reviews, Content contents, CoverPhoto coverPhoto,
			Popularity popularity, Category category) {
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

	public Isbn getIsbn() {
		return isbn;
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
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
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", edition=" + edition + ", publicationYear=" + publicationYear + ", price=" + price + ", reviews="
				+ reviews + ", contents=" + contents + ", coverPhoto=" + coverPhoto + ", popularity=" + popularity
				+ ", category=" + category + "]";
	}
	

    public static class Builder {
        private Isbn isbn;
        private Title title;
        private Author author;
        private Publisher publisher;
        private Edition edition;
        private PublicationYear publicationYear;
        private Price price;
        private Content content;
        private Popularity popularity;
        private CoverPhoto coverPhoto;
        private Reviews reviews;
        private Category category;

        public Builder isbn(String value){
            this.isbn = Isbn.of(value);
            return this;
        }
        public Builder title(String value){
            this.title = Title.of(value);
            return this;
        }
        public Builder author(String value){
            this.author = Author.of(value);
            return this;
        }
        public Builder publisher(Publisher value){
            this.publisher = Publisher.of(value);
            return this;
        }
        public Builder edition(String value){
            this.edition = Edition.of(value);
            return this;
        }
        public Builder publicationYear(int value){
            this.publicationYear = PublicationYear.of(value);
            return this;
        }
        public Builder price(double value){
            this.price = Price.of(value);
            return this;
        }
        public Builder content(List<String> value){
            this.content = Content.of(value);
            return this;
        }
        public Builder popularity(int value){
            this.popularity = Popularity.of(value);
            return this;
        }
        public Builder coverPhoto(byte[] value){
            this.coverPhoto = CoverPhoto.valueOf(value);
            return this;
        }
        public Builder reviews(List<String> value){
            this.reviews = Reviews.of(value);
            return this;
        }
        public Builder category(Category value){
            this.category = Category.of(value);
            return this;
        }
        public Book build(){
            var book = new Book(isbn, title, author, publisher, edition,
        			publicationYear, price, reviews, content, coverPhoto,
        			popularity, category);
            return book;
        }
    }

}
