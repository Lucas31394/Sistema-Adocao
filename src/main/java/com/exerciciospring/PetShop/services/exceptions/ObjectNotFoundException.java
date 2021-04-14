package com.exerciciospring.PetShop.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(Long id) {
		super("Resource not found! Id: " + id);
	}

}
