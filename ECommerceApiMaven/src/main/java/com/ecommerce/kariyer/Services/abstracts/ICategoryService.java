package com.ecommerce.kariyer.Services.abstracts;

import java.util.List;

import com.ecommerce.kariyer.Entities.Categories;

public interface ICategoryService {
	String create(Categories categories);
	String update(Categories categories);
	String delete(int id);
	List<Categories> getAll();
	public Categories GetByIdOneRow(int id);

}
