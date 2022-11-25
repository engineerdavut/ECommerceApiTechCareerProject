package com.ecommerce.kariyer.Services.concretes;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import com.ecommerce.kariyer.Entities.ProductImages;
import com.ecommerce.kariyer.Entities.TemporaryBasket;
import com.ecommerce.kariyer.Repositeries.ProductImageRepository;

import com.ecommerce.kariyer.Services.abstracts.IProductImageService;
@Service
public class ProductImageManager implements IProductImageService{
	@Autowired
	private ProductImageRepository productImageRepository;
	@Override
	public String create( ProductImages productImages) {
		// TODO Auto-generated method stub
		try {
			this.productImageRepository.save(productImages);
			return "urun resmi eklendi.";
		}catch(Exception ex) {
			return ex.getMessage();
		}
		
	}


	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		try {
			this.productImageRepository.deleteById(id);
			return "urun resmi silindi.";
		}catch(Exception ex) {
			return ex.getMessage();
		}
	}

	@Override
	public List<ProductImages> getAll(int id) {
		// TODO Auto-generated method stub
		List<ProductImages>  list=new ArrayList<>();
		for(ProductImages productImages:productImageRepository.findAll()) {
			if(productImages.productid==id) {
				list.add(productImages);
			}
		}
		return list;
	}

}