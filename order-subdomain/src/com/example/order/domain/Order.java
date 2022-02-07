package com.example.order.domain;

import java.util.Objects;

import com.example.book.domain.Isbn;
import com.example.customer.domain.CustomerId;


public class Order {

	private final OrderId orderId;
	private final CustomerId customerId;
	private final Isbn isbn;
	
	public Order(OrderId orderId, CustomerId customerId, Isbn isbn) {
		this.orderId = orderId;
		this.customerId = customerId;
		this.isbn = isbn;
	}

	public OrderId getOrderId() {
		return orderId;
	}

	public CustomerId getCustomerId() {
		return customerId;
	}

	public Isbn getIsbn() {
		return isbn;
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(orderId, other.orderId);
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerId=" + customerId + ", isbn=" + isbn + "]";
	}
	
	public static class Builder{
		private OrderId orderId;
		private CustomerId customerId;
		private Isbn isbn;
	}
	
	
}
