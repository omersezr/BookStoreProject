package com.example.sale.application.business.event;

import com.example.sale.domain.Sale;

public class SaleSavedEvent extends SaleEvent {
	private final Sale sale;

	public SaleSavedEvent(Sale sale) {
		this.sale = sale;
	}

	public Sale getSale() {
		return sale;
	}
	

}
