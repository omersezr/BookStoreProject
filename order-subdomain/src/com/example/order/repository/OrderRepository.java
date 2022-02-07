package com.example.order.repository;

import java.util.Optional;

import com.example.book.domain.Isbn;
import com.example.order.domain.Order;
import com.example.order.domain.OrderId;

public interface OrderRepository {
	
	boolean existsByOrder(OrderId orderId);
	
	Order save(Order order);
	
	Optional<Order> remove(Order orderId);

}
