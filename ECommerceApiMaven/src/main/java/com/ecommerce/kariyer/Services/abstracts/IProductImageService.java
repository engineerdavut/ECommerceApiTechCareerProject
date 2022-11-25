package com.ecommerce.kariyer.Services.abstracts;

import java.util.List;


import com.ecommerce.kariyer.Entities.ProductImages;

public interface IProductImageService {
	String create(ProductImages productImages);
	String delete(int id);
	List<ProductImages> getAll(int id);
}
