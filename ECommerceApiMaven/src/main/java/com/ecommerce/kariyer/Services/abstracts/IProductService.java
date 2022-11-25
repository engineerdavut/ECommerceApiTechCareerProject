package com.ecommerce.kariyer.Services.abstracts;

import java.util.List;


import com.ecommerce.kariyer.Entities.Products;

public interface IProductService {
	String create(Products products);
	String update(Products products);
	String delete(int id);
	List<Products> getAll();

}
