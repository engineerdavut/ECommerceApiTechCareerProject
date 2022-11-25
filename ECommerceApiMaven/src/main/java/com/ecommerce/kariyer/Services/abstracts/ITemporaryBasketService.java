package com.ecommerce.kariyer.Services.abstracts;

import java.util.List;


import com.ecommerce.kariyer.Entities.TemporaryBasket;

public interface ITemporaryBasketService {
	String create(TemporaryBasket temporaryBasket);
	String update(TemporaryBasket temporaryBasket);
	String delete(int id);
	List<TemporaryBasket> getAll(int id);

}
