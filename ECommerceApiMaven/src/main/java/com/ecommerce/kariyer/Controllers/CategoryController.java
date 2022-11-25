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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.kariyer.Entities.Categories;
import com.ecommerce.kariyer.Services.concretes.CategoryManager;

@RestController
@RequestMapping("api")
public class CategoryController {
	@Autowired
	public CategoryManager  categoryManager;
	@GetMapping("/kategoriler")
	public List<Categories> getAll(){
		return categoryManager.getAll();
	}
	@GetMapping("/kategoriler/{id}")
	public Categories getById(@PathVariable int id){
		return categoryManager.GetByIdOneRow(id);
	}
	@PostMapping("/kategoriler")
	public String save(@Valid @RequestBody Categories category){
		return categoryManager.create(category);
	}
	@PutMapping("/kategoriler")
	public String update(@Valid @RequestBody Categories category){
		return categoryManager.update(category);
	}
	@DeleteMapping("/kategoriler/{id}")
	public String delete(@PathVariable int id){
		return categoryManager.delete(id);
	}

}
