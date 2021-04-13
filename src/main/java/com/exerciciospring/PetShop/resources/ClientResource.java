package com.exerciciospring.PetShop.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exerciciospring.PetShop.domain.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<Client> findAll() {
		Client c = new Client(1L, "Lucas Pereira", "lucas@gmail.com", "999999999");
		return ResponseEntity.ok().body(c);
	}
}
