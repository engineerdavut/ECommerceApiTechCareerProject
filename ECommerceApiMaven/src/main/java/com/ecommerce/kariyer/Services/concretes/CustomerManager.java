package com.ecommerce.kariyer.Services.concretes;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ecommerce.kariyer.Entities.Customers;
import com.ecommerce.kariyer.Repositeries.CustomerRepository;
import com.ecommerce.kariyer.Services.abstracts.ICustomerService;
@Service
public class CustomerManager implements ICustomerService{
	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public String create(@Valid @RequestBody Customers customers) {
		// TODO Auto-generated method stub
		try {
			this.customerRepository.save(customers);
			return "musteri eklendi.";
		}catch(Exception ex) {
			return ex.getMessage();
		}
		
	}

	@Override
	public String update(Customers customers) {
		// TODO Auto-generated method stub
		try {
			this.customerRepository.save(customers);
			return "musteri guncellendi.";
		}catch(Exception ex) {
			return ex.getMessage();
		}
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		try {
			this.customerRepository.deleteById(id);
			return "musteri silindi.";
		}catch(Exception ex) {
			return ex.getMessage();
		}
	}

	@Override
	public List<Customers> getAll() {
		// TODO Auto-generated method stub
		return this.customerRepository.findAll();
	}
	@Override
	public Customers login(String email,String password) {
		
		
		return customerRepository.login(email,password);
	}

}
