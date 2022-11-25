package com.ecommerce.kariyer.Repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.kariyer.Entities.OrderDetails;

public interface OrderDetailRepository extends JpaRepository<OrderDetails,Integer>{

}
