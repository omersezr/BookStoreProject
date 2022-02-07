package com.example.sale.domain;

import java.util.Objects;



public class Sale {
	
	private SaleId saleId;
	private Customer customer;
	private Book book;

	public Sale(SaleId saleId, Customer customer, Book book) {
		this.saleId = saleId;
		this.customer = customer;
		this.book = book;

	}
	public SaleId getSaleId() {
		return saleId;
	}
	public void setSaleId(SaleId saleId) {
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
		return "Sale [saleId=" + saleId + ", customer=" + customer + ", book=" + book + 
				"]";	}
	public static class Builder{
		private SaleId saleId;
		private Customer customer;
		private Book book;
		
		public Builder saleId(String value) {
			this.saleId = SaleId.of(value);
			return this;
		}
		public Builder customer(String value) {
			this.customer = Customer.valueOf(value);
			
			return this;
		}
		public Builder book(String value) {
			this.book = Book.of(value);
			return this;
		}
	
		public Sale build() {
			var sale = new Sale(saleId, customer, book);

			return sale;
		}
		
	}


}
