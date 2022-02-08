package com.example.requistion.application.business;

import java.util.Optional;

import com.example.requistion.Requistion;
import com.example.requistion.RequistionId;
import com.example.requistion.application.RequistionApplication;
import com.example.requistion.infra.EventRequistion;
import com.example.requistion.repository.RequistionRepository;

public class StandardRequistionApplication implements RequistionApplication {
	private RequistionRepository requistionRepository;
	private EventRequistion eventRequistion;
	
	@Override
	public Optional<Requistion> findByRequistionId(RequistionId requistionId) {
		return requistionRepository.findOneByRequistionId(requistionId);
	}

	@Override
	public Requistion requistionSale(Requistion requistion) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
