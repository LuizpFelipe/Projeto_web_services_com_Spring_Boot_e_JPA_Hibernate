package com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.entities.Product;
import com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.repository.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	
}
