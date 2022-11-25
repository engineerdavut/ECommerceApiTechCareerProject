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
import com.ecommerce.kariyer.Entities.TemporaryBasket;
import com.ecommerce.kariyer.Services.concretes.CategoryManager;
import com.ecommerce.kariyer.Services.concretes.TemporaryBasketManager;

@RestController
@RequestMapping("api")
public class TemporaryBasketController {
	@Autowired
	public TemporaryBasketManager  temporaryBasketManager;
	@GetMapping("/cerezler/{id}")
	public List<TemporaryBasket> getAll(@PathVariable int id){
		return temporaryBasketManager.getAll(id);
	}
	/*
	@GetMapping("/cerezler/{id}")
	public TemporaryBasket getById(@PathVariable int id){
		return temporaryBasketManager.GetByIdOneRow(id);
	}*/
	@PostMapping("/cerezler")
	public String save(@Valid @RequestBody TemporaryBasket temporaryBasket){
		return temporaryBasketManager.create(temporaryBasket);
	}
	@PutMapping("/cerezler")
	public String update(@Valid @RequestBody TemporaryBasket temporaryBasket){
		return temporaryBasketManager.update(temporaryBasket);
	}
	@DeleteMapping("/cerezler/{id}")
	public String delete(@PathVariable int id){
		return temporaryBasketManager.delete(id);
	}

}