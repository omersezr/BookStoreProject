package com.example.stock.application.business.event;

import com.example.stock.domain.Stock;

public class StockHiredEvent extends StockEvent {
	
	private final Stock sku;

	public StockHiredEvent(Stock sku) {
		this.sku = sku;
	}

	public Stock getSku() {
		return sku;
	}
	
}
