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
@Table(name="direccion")
@NamedQueries({@NamedQuery(name = "Direccion.findAll", query = "SELECT o FROM Direccion o"),
@NamedQuery(name = "Direccion.findById", query = "SELECT o FROM Direccion o WHERE o.id = :id")})
public class Direccion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_direccion")
	private Integer id_direccion;
	
	@Column(name = "street")
	private String street;
	
	@Column(name = "suite")
	private String suite;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "zipcode")
	private String zipcode;
	
	private Integer id_geo;

	
	public Integer getId_direccion() {
		return id_direccion;
	}

	public void setId_direccion(Integer id_direccion) {
		this.id_direccion = id_direccion;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getSuite() {
		return suite;
	}

	public void setSuite(String suite) {
		this.suite = suite;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Integer getId_geo() {
		return id_geo;
	}

	public void setId_geo(Integer id_geo) {
		this.id_geo = id_geo;
	}
	

}
