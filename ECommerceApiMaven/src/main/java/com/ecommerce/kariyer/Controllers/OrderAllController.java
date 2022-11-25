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
import com.ecommerce.kariyer.Entities.OrderAdress;
import com.ecommerce.kariyer.Entities.OrderDetails;
import com.ecommerce.kariyer.Entities.Orders;
import com.ecommerce.kariyer.Services.concretes.CategoryManager;
import com.ecommerce.kariyer.Services.concretes.OrderAllManager;
import com.ecommerce.kariyer.ViewModel.OrderAllModel;

@RestController
@RequestMapping("api")
public class OrderAllController {
	@Autowired
	public OrderAllManager  orderAllManager;
	@GetMapping("/siparisler")
	public List<OrderAllModel> getAll(){
		return orderAllManager.getAll();
	}
	@GetMapping("/siparisler/{id}")
	public OrderAllModel getById(@PathVariable int id){
		return orderAllManager.GetByIdOneRow(id);
	}
	@PostMapping("/siparisler")
	public String save(@Valid @RequestBody Orders order,@RequestBody OrderAdress orderAdress,@RequestBody OrderDetails orderDetails){
		return orderAllManager.create(order,orderAdress,orderDetails);
	}
	/*
	@PutMapping("/siparisler")
	public String update(@Valid @RequestBody OrderAllModel orderAllModel){
		return orderAllManager.update(orderAllModel);
	}
	@DeleteMapping("/siparisler/{id}")
	public String delete(@PathVariable int id){
		return orderAllManager.delete(id);
	}
	*/
}