package com.ecommerce.kariyer.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id ;
	@Column(length=50)
	private String orderstatus;
	@Column(length=20)
	private String orderdate;
	private int customerId;
	@Column(length=50)
	private String paymenttype;


	private float  totalprice;
	private float  totaldiscountprice;
}
