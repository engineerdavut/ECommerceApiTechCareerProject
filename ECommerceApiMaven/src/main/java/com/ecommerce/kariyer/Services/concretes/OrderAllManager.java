package com.ecommerce.kariyer.Services.concretes;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestBody;


import com.ecommerce.kariyer.Entities.OrderAdress;
import com.ecommerce.kariyer.Entities.OrderDetails;
import com.ecommerce.kariyer.Entities.Orders;

import com.ecommerce.kariyer.Repositeries.OrderAdressRepository;
import com.ecommerce.kariyer.Repositeries.OrderDetailRepository;
import com.ecommerce.kariyer.Repositeries.OrderRepository;
import com.ecommerce.kariyer.Services.abstracts.IOrderAllService;
import com.ecommerce.kariyer.ViewModel.OrderAllModel;
@Service
public class OrderAllManager implements IOrderAllService{
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private OrderAdressRepository orderAdressRepository;
	@Autowired
	private OrderDetailRepository orderDetailRepository;

	@Override
	public String create( Orders order, OrderAdress orderAdress, OrderDetails orderDetails) {
		// TODO Auto-generated method stub
		try {
			this.orderRepository.save(order);
			orderAdress.orderid=order.id;
			orderDetails.orderid=order.id;

			this.orderAdressRepository.save(orderAdress);
			this.orderDetailRepository.save(orderDetails);
			return "siparis alindi.";
		}catch(Exception ex) {
			return ex.getMessage();
		}

	}


	@Override
	public List<OrderAllModel> getAll() {
		// TODO Auto-generated method stub
		List<OrderAllModel>  list=new ArrayList<>();
		OrderAllModel orderAllModel=new  OrderAllModel();
		for(Orders order:orderRepository.findAll()) {
			orderAllModel.orders=order;
			for(OrderAdress orderAdress:orderAdressRepository.findAll()) {
				if(orderAdress.orderid==order.id) {
					orderAllModel.orderAdress.add(orderAdress);
				}
			}
			for(OrderDetails orderDetail:orderDetailRepository.findAll()) {
				if(orderDetail.orderid==order.id) {
					orderAllModel.orderDetails.add(orderDetail);
				}
			}
			list.add(orderAllModel);

		}
		return list;
	}


	@Override
	public OrderAllModel GetByIdOneRow(int id) {
		// TODO Auto-generated method stub
		OrderAllModel orderAllModel=new  OrderAllModel();
		orderAllModel.orders=orderRepository.findById(id).orElse(null);
		if(orderAllModel.orders!=null) {
			for(OrderAdress orderAdress:orderAdressRepository.findAll()) {
				if(orderAdress.orderid==id) {
					orderAllModel.orderAdress.add(orderAdress);
				}
			}
			for(OrderDetails orderDetail:orderDetailRepository.findAll()) {
				if(orderDetail.orderid==id) {
					orderAllModel.orderDetails.add(orderDetail);
				}
			}
			
		}
		
		return orderAllModel;
	}

}
