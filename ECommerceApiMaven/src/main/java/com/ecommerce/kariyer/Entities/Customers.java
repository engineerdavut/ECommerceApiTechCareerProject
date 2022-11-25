package com.ecommerce.kariyer.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;



@Entity
@Table(name="customers")
public class Customers {
   @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	@Column(length=50)
	private String name;
	@Column(length=50)
	private String surname;
	@Column(length=50)
	private String password;
	@Column(length=50)
	@Email(message="email hatali")
	private String mail;
	@Column(length=50)
	@Pattern(regexp="[0-9\\s]{12}")
	private String phone;

	private boolean status;

}
