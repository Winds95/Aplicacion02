package com.distribuida.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="todo")
@NamedQueries({@NamedQuery(name = "Todo.findAll", query = "SELECT o FROM Todo o"),
@NamedQuery(name = "Todo.findById", query = "SELECT o FROM Todo o WHERE o.id = :id")})
public class Todo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "website")
	private String website;
	
	private Integer id_company;
	private Integer id_direccion;	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Integer getId_company() {
		return id_company;
	}

	public void setId_company(Integer id_company) {
		this.id_company = id_company;
	}

	public Integer getId_direccion() {
		return id_direccion;
	}

	public void setId_direccion(Integer id_direccion) {
		this.id_direccion = id_direccion;
	}		

}
