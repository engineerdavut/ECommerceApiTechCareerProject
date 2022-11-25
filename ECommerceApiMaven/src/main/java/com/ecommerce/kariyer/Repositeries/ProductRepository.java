package com.ecommerce.kariyer.Repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.kariyer.Entities.Products;

public interface ProductRepository extends JpaRepository<Products,Integer>{

}
