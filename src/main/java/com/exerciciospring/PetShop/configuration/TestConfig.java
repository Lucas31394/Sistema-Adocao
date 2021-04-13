package com.exerciciospring.PetShop.configuration;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.exerciciospring.PetShop.domain.Client;
import com.exerciciospring.PetShop.repositories.ClientRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Client c1 = new Client(null, "Lucas Pereira", "lucas@gmail.com", "999999999");
		Client c2 = new Client(null, "Maria Barros", "maria@gmail.com", "999999998");
		
		clientRepository.saveAll(Arrays.asList(c1, c2));
		
	}
	
}
