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
	
	public void delete(Long id) {
		find(id);
		repo.deleteById(id);
	}
	
	public Client update(Long id, Client obj) {
		Client newObj = repo.getOne(id);
		updateData(newObj, obj);
		return repo.save(newObj);
	}

	private void updateData(Client newObj, Client obj) {
		newObj.setName(obj.getName());
		newObj.setEmail(obj.getEmail());
		newObj.setPhone(obj.getPhone());
	}

}
