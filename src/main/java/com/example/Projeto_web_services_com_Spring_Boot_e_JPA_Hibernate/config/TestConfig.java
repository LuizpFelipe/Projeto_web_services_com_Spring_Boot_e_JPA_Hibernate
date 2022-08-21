package com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.entities.User;
import com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.repository.CategoryRepository;
import com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.repository.OrderRepository;
import com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.repository.ProductRepository;
import com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository produtcRepository;
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList());

	}

}
