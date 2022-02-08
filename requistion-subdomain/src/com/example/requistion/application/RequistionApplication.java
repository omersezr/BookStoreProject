package com.example.requistion.application;

import java.util.Optional;

import com.example.requistion.Requistion;
import com.example.requistion.RequistionId;

public interface RequistionApplication {
	Optional<Requistion> findByRequistionId(RequistionId requistionId);
	Requistion requistionSale (Requistion requistion);

}



