package com.ecommerce.kariyer.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orderadress")
public class OrderAdress {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	@Column(length=50)
	private String adressname;

	@Column(length=50)
	private String cityname;
	@Column(length=50)
	private String district;
	@Column(length=350)
	private String fulladress;
	@Column(length=11)
	private String phone;
	public int orderid;

}
