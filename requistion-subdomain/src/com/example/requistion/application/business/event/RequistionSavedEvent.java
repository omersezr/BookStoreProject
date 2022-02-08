package com.example.requistion.application.business.event;

import com.example.requistion.Requistion;

public class RequistionSavedEvent extends RequistionEvent{
	private final Requistion requistion;

	public RequistionSavedEvent(Requistion requistion) {
		this.requistion = requistion;
	}

	public Requistion getRequistion() {
		return requistion;
	}
	
}
