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
import com.ecommerce.kariyer.Entities.Products;

import com.ecommerce.kariyer.Services.concretes.ProductManager;

@RestController
@RequestMapping("api")
public class ProductController {
	@Autowired
	public ProductManager  productManager;
	@GetMapping("/urunler")
	public List<Products> getAll(){
		return productManager.getAll();
	}
	/*
	@GetMapping("/urunler/{id}")
	public Products getById(@PathVariable int id){
		return productManager.GetByIdOneRow(id);
	}*/
	@PostMapping("/urunler")
	public String save(@Valid @RequestBody Products product){
		return productManager.create(product);
	}
	@PutMapping("/urunler")
	public String update(@Valid @RequestBody Products product){
		return productManager.update(product);
	}
	@DeleteMapping("/urunler/{id}")
	public String delete(@PathVariable int id){
		return productManager.delete(id);
	}

}
