package com.ecommerce.kariyer.Repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.kariyer.Entities.Orders;

public interface OrderRepository extends JpaRepository<Orders,Integer>{

}
