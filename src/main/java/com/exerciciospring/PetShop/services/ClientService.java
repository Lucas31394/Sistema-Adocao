package com.exerciciospring.PetShop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exerciciospring.PetShop.domain.Client;
import com.exerciciospring.PetShop.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repo;
	
	public Client find(Long id) {
		Optional<Client> obj = repo.findById(id);
		return obj.get();
	}
	
	public List<Client> findAll() {
		return repo.findAll();
	}
	
	public Client insert(Client obj) {
		obj.setId(null);
		repo.save(obj);
		return obj;
	}

}
