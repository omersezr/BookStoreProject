package com.example.sale.application;

import java.util.Optional;

import com.example.sale.domain.Sale;
import com.example.sale.domain.SaleId;

public interface SaleApplication {
	
	Optional<Sale> findBySaleId(SaleId saleId);
	Sale saveSale (Sale sale);

}
