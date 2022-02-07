package com.example.stock.application.business;

import com.example.stock.application.StockApplication;
import com.example.stock.application.business.event.StockHiredEvent;
import com.example.stock.domain.Stock;
import com.example.stock.infra.EventPublisher;
import com.example.stock.repository.StockRepository;

public class StandardStockApplication implements StockApplication {
	
	private StockRepository stockRepository;
	private EventPublisher eventPublisher;
	
	public StandardStockApplication(StockRepository stockRepository, EventPublisher eventPublisher) {
		this.stockRepository = stockRepository;
		this.eventPublisher = eventPublisher;
	}

	@Override
	public Stock hireStock(Stock sku) {
		var stock = sku.getSku();
		Stock addstock = stockRepository.increase(sku);
		var businessEvent = new StockHiredEvent(addstock);
		eventPublisher.publishEvent(businessEvent);
		return addstock;
	}

	@Override
	public Stock fireStock(Stock sku) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
