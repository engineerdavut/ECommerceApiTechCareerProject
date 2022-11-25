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

import com.ecommerce.kariyer.Entities.ProductImages;
import com.ecommerce.kariyer.Services.concretes.ProductImageManager;

@RestController
@RequestMapping("api")
public class ProductImageController {
	@Autowired
	public ProductImageManager  productImageManager;
	@GetMapping("/urunresimleri/{id}")
	public List<ProductImages> getAll(@PathVariable int id){
		return productImageManager.getAll(id);
	}
	/*
	@GetMapping("/urunresimleri/{id}")
	public ProductImages getById(@PathVariable int id){
		return productImageManager.GetByIdOneRow(id);
	}*/
	@PostMapping("/urunresimleri")
	public String save(@Valid @RequestBody ProductImages productImage){
		return productImageManager.create(productImage);
	}

	@DeleteMapping("/urunresimleri/{id}")
	public String delete(@PathVariable int id){
		return productImageManager.delete(id);
	}

}
