package com.example.sale.domain;

import java.util.Objects;

public class Sale {
	
	private Long saleId;
	private Customer customer;
	private Book book;
	private Timestamp timestamp;
	public Sale(Long saleId, Customer customer, Book book, Timestamp timestamp) {
		this.saleId = saleId;
		this.customer = customer;
		this.book = book;
		this.timestamp = timestamp;
	}
	public Long getSaleId() {
		return saleId;
	}
	public void setSaleId(Long saleId) {
		this.saleId = saleId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public int hashCode() {
		return Objects.hash(saleId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sale other = (Sale) obj;
		return Objects.equals(saleId, other.saleId);
	}
	@Override
	public String toString() {
		return "Sale [saleId=" + saleId + ", customer=" + customer + ", book=" + book + ", timestamp=" + timestamp
				+ "]";
	}
	public static class Builder{
		private Long saleId;
		private Customer customer;
		private Book book;
		private Timestamp timestamp;
		
	}


}
