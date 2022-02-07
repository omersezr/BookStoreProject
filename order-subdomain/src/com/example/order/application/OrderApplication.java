package com.example.order.application;

import com.example.order.domain.Order;

public interface OrderApplication {
	
	Order hireOrder(Order orderId);
	
	Order fireOrder(Order orderId);

}
