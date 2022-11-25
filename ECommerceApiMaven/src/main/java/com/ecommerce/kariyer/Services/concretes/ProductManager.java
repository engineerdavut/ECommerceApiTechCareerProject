package com.ecommerce.kariyer.Services.concretes;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ecommerce.kariyer.Entities.Products;
import com.ecommerce.kariyer.Repositeries.ProductRepository;

import com.ecommerce.kariyer.Services.abstracts.IProductService;
@Service
public class ProductManager implements IProductService{
	@Autowired
	private ProductRepository productRepository;
	@Override
	public String create( Products products) {
		// TODO Auto-generated method stub
		try {
			this.productRepository.save(products);
			return "urun eklendi.";
		}catch(Exception ex) {
			return ex.getMessage();
		}
		
	}

	@Override
	public String update( Products products) {
		// TODO Auto-generated method stub
		try {
			this.productRepository.save(products);
			return "urun guncellendi.";
		}catch(Exception ex) {
			return ex.getMessage();
		}
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		try {
			this.productRepository.deleteById(id);
			return "urun silindi.";
		}catch(Exception ex) {
			return ex.getMessage();
		}
	}

	@Override
	public List<Products> getAll() {
		// TODO Auto-generated method stub
		return this.productRepository.findAll();
	}

}
