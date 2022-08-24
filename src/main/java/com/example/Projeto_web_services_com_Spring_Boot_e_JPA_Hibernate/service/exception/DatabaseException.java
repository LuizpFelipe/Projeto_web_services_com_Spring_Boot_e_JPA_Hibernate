package com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.service.exception;

public class DatabaseException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	
	public DatabaseException(String msg) {
		super(msg);
	}
}
