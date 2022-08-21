package com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.entities.Category;
import com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.repository.CategoryRepository;


@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
	
}
