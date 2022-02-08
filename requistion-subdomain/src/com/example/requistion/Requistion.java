package com.example.requistion;

import java.util.Objects;

public class Requistion {
	private RequistionId requistionId;
	private Isbn isbn;
	private Publisher publisher;
	public Requistion(RequistionId requistionId, Isbn isbn, Publisher publisher) {
		this.requistionId = requistionId;
		this.isbn = isbn;
		this.publisher = publisher;
	}
	public RequistionId getRequistionId() {
		return requistionId;
	}
	public void setRequistionId(RequistionId requistionId) {
		this.requistionId = requistionId;
	}
	public Isbn getIsbn() {
		return isbn;
	}
	public void setIsbn(Isbn isbn) {
		this.isbn = isbn;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	@Override
	public int hashCode() {
		return Objects.hash(requistionId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Requistion other = (Requistion) obj;
		return Objects.equals(requistionId, other.requistionId);
	}
	@Override
	public String toString() {
		return "Requistion [requistionId=" + requistionId + ", isbn=" + isbn + ", publisher=" + publisher + "]";
	}

            
}
