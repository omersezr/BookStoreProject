package com.example.sale.application.business;

import java.util.Optional;

import com.example.sale.application.SaleApplication;
import com.example.sale.application.business.event.SaleSavedEvent;
import com.example.sale.application.business.exception.ExistingSaleException;
import com.example.sale.domain.Sale;
import com.example.sale.domain.SaleId;
import com.example.sale.infra.EventPublisher;
import com.example.sale.repository.SaleRepository;

public class StandardSaleApplication implements SaleApplication {
	private SaleRepository saleRepository;
	private EventPublisher eventPublisher;

	public StandardSaleApplication(SaleRepository saleRepository, EventPublisher eventPublisher) {
		this.saleRepository = saleRepository;
		this.eventPublisher = eventPublisher;
	}

	@Override
	public Optional<Sale> findBySaleId(SaleId saleId) {
		
		return saleRepository.findOneBySaleId(saleId);
	}

	@Override
	public Sale saveSale(Sale sale) {
		var saleId = sale.getSaleId();
		if (saleRepository.existsBySaleId(saleId))
			throw new ExistingSaleException("Sale already exist", saleId.getValue());
		Sale savedSale = saleRepository.save(sale);
		var businessEvent = new SaleSavedEvent(savedSale);
		eventPublisher.publishEvent(businessEvent);
		return savedSale;
	}

}
