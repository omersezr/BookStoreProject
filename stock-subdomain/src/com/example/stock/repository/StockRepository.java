package com.example.stock.repository;

import java.util.Optional;

import com.example.stock.domain.Stock;
import com.example.stock.domain.StockKeepingUnit;

public interface StockRepository {
	
	boolean existsByStock(StockKeepingUnit sku);
	
	Stock increase(Stock sku);
	
	Optional<Stock> decrease(StockKeepingUnit sku);

}
