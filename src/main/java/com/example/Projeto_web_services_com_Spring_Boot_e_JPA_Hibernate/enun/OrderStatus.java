package com.example.Projeto_web_services_com_Spring_Boot_e_JPA_Hibernate.enun;

public enum OrderStatus {
	WAITING_PAYMENT(0),
	PAID(1),
	SHIPPED(2),
	DELIVERED(3),
	CANCELED(4);
	
	
	private int code;

	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value :OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}	
		}
		throw new IllegalArgumentException("OrderStatus Code Invalid!!");
	}
}
