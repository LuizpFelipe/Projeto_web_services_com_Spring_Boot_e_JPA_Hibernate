package com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.entities.User;
import com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.repository.UserRepository;
import com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.service.exception.DatabaseException;
import com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.service.exception.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public User insert(User objt) {
		return repository.save(objt);
	}

	public void delete(long id) {
		try {

			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}

	public User update(Long id, User obj) {
		try {
		User entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
		}catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());

	}

}
