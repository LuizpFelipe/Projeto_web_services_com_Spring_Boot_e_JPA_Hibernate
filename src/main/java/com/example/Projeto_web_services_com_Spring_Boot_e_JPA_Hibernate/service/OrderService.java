package com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.entities.Order;
import com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public List<Order> findAll() {
		return repository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
