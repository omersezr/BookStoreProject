package com.example.order.application.business;

import java.util.Optional;

import com.example.book.application.business.event.AddBook;
import com.example.book.application.business.exception.BookNotFoundException;
import com.example.book.domain.Book;
import com.example.order.application.OrderApplication;
import com.example.order.application.business.event.OrderFiredEvent;
import com.example.order.application.business.event.OrderHiredEvent;
import com.example.order.domain.Order;
import com.example.order.infra.EventPublisher;
import com.example.order.repository.OrderRepository;
import com.example.order.application.business.exception.OrderNotFoundException;


public class StandardOrderApplication implements OrderApplication {
	
	private OrderRepository orderRepository;
	private EventPublisher eventPublisher;
	
	public StandardOrderApplication(OrderRepository orderRepository, EventPublisher eventPublisher) {
		this.orderRepository = orderRepository;
		this.eventPublisher = eventPublisher;
	}

	@Override
	public Order hireOrder(Order orderId) {
		var order = orderId.getOrderId();
		Order savedOrder = orderRepository.save(orderId);
		var businessEvent = new OrderHiredEvent(savedOrder);
		eventPublisher.publishEvent(businessEvent);
		return savedOrder;
	}

	@Override
	public Order fireOrder(Order orderId) {
		Optional<Order> removedOrder = orderRepository.remove(orderId);
		/*
		 * var order = removedOrder.orElseThrow(() -> new
		 * OrderNotFoundException("Order does not exist", orderId.getValue()));
		 * eventPublisher.publishEvent(new OrderFiredEvent(orderId));
		 */
		return null;
	}
	
	

}
