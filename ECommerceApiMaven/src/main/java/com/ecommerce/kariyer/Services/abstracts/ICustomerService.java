package com.ecommerce.kariyer.Services.abstracts;

import java.util.List;

import com.ecommerce.kariyer.Entities.Customers;

public interface ICustomerService {
	String create(Customers customers);
	String update(Customers customers);
	String delete(int id);
	List<Customers> getAll();
	Customers login(String email,String password);
}
