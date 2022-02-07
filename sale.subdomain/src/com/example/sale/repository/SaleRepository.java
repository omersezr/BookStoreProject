package com.example.sale.repository;

import java.util.Optional;

import com.example.sale.domain.Sale;
import com.example.sale.domain.SaleId;

public interface SaleRepository {
	
 
	boolean existsBySaleId(SaleId saleId);
	Sale save(Sale sale);
	Optional<Sale> findOneBySaleId(SaleId saleId);
	
}
