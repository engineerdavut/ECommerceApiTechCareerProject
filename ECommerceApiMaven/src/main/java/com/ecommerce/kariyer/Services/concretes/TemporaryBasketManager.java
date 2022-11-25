package com.ecommerce.kariyer.Services.concretes;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import com.ecommerce.kariyer.Entities.TemporaryBasket;

import com.ecommerce.kariyer.Repositeries.TemporaryBasketRepository;

import com.ecommerce.kariyer.Services.abstracts.ITemporaryBasketService;
@Service
public class TemporaryBasketManager implements ITemporaryBasketService{
	@Autowired
	private TemporaryBasketRepository temporaryBasketRepository;
	@Override
	public String create(  TemporaryBasket temporaryBaskets) {
		// TODO Auto-generated method stub
		try {
			this.temporaryBasketRepository.save(temporaryBaskets);
			return "gecici hafiza eklendi.";
		}catch(Exception ex) {
			return ex.getMessage();
		}
		
	}

	@Override
	public String update( TemporaryBasket temporaryBaskets) {
		// TODO Auto-generated method stub
		try {
			this.temporaryBasketRepository.save(temporaryBaskets);
			return "gecici hafiza guncellendi.";
		}catch(Exception ex) {
			return ex.getMessage();
		}
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		try {
			this.temporaryBasketRepository.deleteById(id);
			return "gecici hafiza silindi.";
		}catch(Exception ex) {
			return ex.getMessage();
		}
	}

	@Override
	public List<TemporaryBasket> getAll(int id) {
		// TODO Auto-generated method stub
		List<TemporaryBasket>  list=new ArrayList<>();
		for(TemporaryBasket temporaryBasket:temporaryBasketRepository.findAll()) {
			if(temporaryBasket.cookieid==id) {
				list.add(temporaryBasket);
			}
		}
		return list;
	}

}
