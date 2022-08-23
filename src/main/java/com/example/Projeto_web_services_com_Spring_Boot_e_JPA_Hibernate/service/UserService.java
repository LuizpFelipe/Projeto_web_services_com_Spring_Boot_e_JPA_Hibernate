package com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.entities.User;
import com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	public User insert(User objt) {
		return repository.save(objt);
	}
	
	public void delete(long id) {
		repository.deleteById(id);
	}
	
}
