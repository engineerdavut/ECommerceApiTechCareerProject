package com.ecommerce.kariyer.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.kariyer.Entities.Categories;
import com.ecommerce.kariyer.Entities.Customers;
import com.ecommerce.kariyer.Services.concretes.CategoryManager;
import com.ecommerce.kariyer.Services.concretes.CustomerManager;

@RestController
@RequestMapping("api")
public class CustomerController {
	@Autowired
	public CustomerManager  customerManager;
	@GetMapping("/musteriler")
	public List<Customers> getAll(){
		return customerManager.getAll();
	}
	@GetMapping("/musteriler/{id}")
	public Customers login(@Valid @PathVariable String email,@PathVariable String password){
		return customerManager.login(email,password);
	}
	@PostMapping("/musteriler")
	public String save(@Valid @RequestBody Customers customer){
		return customerManager.create(customer);
	}
	@PutMapping("/musteriler")
	public String update(@Valid @RequestBody Customers customer){
		return customerManager.update(customer);
	}
	@DeleteMapping("/musteriler/{id}")
	public String delete(@PathVariable int id){
		return customerManager.delete(id);
	}

}
