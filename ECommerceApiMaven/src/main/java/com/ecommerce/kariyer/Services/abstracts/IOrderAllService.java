package com.ecommerce.kariyer.Services.abstracts;

import java.util.List;


import com.ecommerce.kariyer.Entities.OrderAdress;
import com.ecommerce.kariyer.Entities.OrderDetails;
import com.ecommerce.kariyer.Entities.Orders;
import com.ecommerce.kariyer.ViewModel.OrderAllModel;

public interface IOrderAllService {
	String create(Orders orders,OrderAdress orderAdress,OrderDetails orderDetails);
	List<OrderAllModel> getAll();
	public OrderAllModel GetByIdOneRow(int id);
}
