package com.ecommerce.kariyer.Services.concretes;

import java.util.List;
import java.util.Locale.Category;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import com.ecommerce.kariyer.Entities.Categories;
import com.ecommerce.kariyer.Repositeries.CategoryRepository;
import com.ecommerce.kariyer.Services.abstracts.ICategoryService;
@Service
public class CategoryManager implements ICategoryService{
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public String create( Categories categories) {
		try {
			this.categoryRepository.save(categories);
			return "categori eklendi.";
		}catch(Exception ex) {
			return ex.getMessage();
		}
	}

	@Override
	public String update(Categories categories) {
		// TODO Auto-generated method stub
		try {
			this.categoryRepository.save(categories);
			return "categori guncellendi.";
		}catch(Exception ex) {
			return ex.getMessage();
		}
	}

	@Override
	public String  delete(int id) {
		// TODO Auto-generated method stub
		try 
		{
			this.categoryRepository.deleteById(id);
			return "categori silindi";
		}
		catch(Exception e) 
		{
			return e.getMessage();
		}		
	}
	public Categories GetByIdOneRow(int id)
	{
		return categoryRepository.findById(id).orElse(null);
	}

	@Override
	public List<Categories> getAll() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

}
