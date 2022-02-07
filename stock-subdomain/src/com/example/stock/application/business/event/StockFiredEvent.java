package com.example.stock.application.business.event;

import com.example.stock.domain.Stock;

public class StockFiredEvent extends StockEvent {
	
	private final Stock sku;

	public StockFiredEvent(Stock sku) {
		this.sku = sku;
	}

	public Stock getSku() {
		return sku;
	}

}
