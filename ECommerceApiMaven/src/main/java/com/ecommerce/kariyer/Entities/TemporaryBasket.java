package com.ecommerce.kariyer.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="temporarybasket")
public class TemporaryBasket {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	@Column(length=50)
	private String productname;
	private int quantity;
	private float price;
	private float discountprice;
	@Column(length=100)
	private String images;
	private int productid;
	public int cookieid;
}
