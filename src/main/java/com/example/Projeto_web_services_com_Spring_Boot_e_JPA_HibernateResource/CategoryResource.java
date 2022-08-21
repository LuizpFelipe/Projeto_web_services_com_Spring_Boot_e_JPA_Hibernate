package com.example.Projeto_web_services_com_Spring_Boot_e_JPA_HibernateResource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.entities.User;
import com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class CategoryResource {
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
