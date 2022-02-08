package com.example.requistion.repository;

import java.util.Optional;

import com.example.requistion.Requistion;
import com.example.requistion.RequistionId;

public interface RequistionRepository {
	 
		boolean RequistionId(RequistionId requistionId) ;
		
		Requistion save(Requistion requistion);
		Optional<Requistion> findOneByRequistionId(RequistionId requistionId);
		
	}
