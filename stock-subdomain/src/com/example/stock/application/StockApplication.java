package com.example.stock.application;

import com.example.stock.domain.Stock;

public interface StockApplication {
	
	Stock hireStock(Stock sku);
	
	Stock fireStock(Stock sku);

}
