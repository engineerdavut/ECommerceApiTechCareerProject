package com.ecommerce.kariyer.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="products")
public class Products {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	@Column(length=50)
	@NotEmpty(message="bos birakilamaz")
	@Max(value =50, message = "Maximum 450 karakter Girilebilir.")
	private String productname;
	@Column(length=450)
	@Max(value = 450, message = "Maximum 450 karakter Girilebilir.")
	private String explanation;
	@NotEmpty(message="bos birakilamaz")
	private float price;
	@NotEmpty(message="bos birakilamaz")
	private float discountprice;
	@NotEmpty(message="bos birakilamaz")
	private int stock;
	@Column(length=100)
	private String images;
	private boolean status;
	
}
