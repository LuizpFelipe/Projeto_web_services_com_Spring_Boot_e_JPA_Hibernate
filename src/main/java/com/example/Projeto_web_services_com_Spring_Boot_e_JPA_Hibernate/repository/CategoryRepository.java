package com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
