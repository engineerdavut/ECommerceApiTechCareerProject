package com.ecommerce.kariyer.Repositeries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ecommerce.kariyer.Entities.Customers;

public interface CustomerRepository extends JpaRepository<Customers,Integer>{
	//inline sorgu
	@Query(value="select * from customers where email=:{email} and password=:{password} LIMIT 1",nativeQuery=true)
	public Customers login(@Param("email") String email,@Param("password") String password);
}
