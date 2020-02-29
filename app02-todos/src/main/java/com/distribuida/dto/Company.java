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
@Table(name="company")
@NamedQueries({@NamedQuery(name = "Company.findAll", query = "SELECT o FROM Company o"),
@NamedQuery(name = "Company.findById", query = "SELECT o FROM Company o WHERE o.id = :id")})
public class Company implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_company")
	private Integer id_company;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "catchPhrase")
	private String catchPhrase;
	
	@Column(name = "bs")
	private String bs;
	

	public Integer getId_company() {
		return id_company;
	}

	public void setId_company(Integer id_company) {
		this.id_company = id_company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCatchPhrase() {
		return catchPhrase;
	}

	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}

	public String getBs() {
		return bs;
	}

	public void setBs(String bs) {
		this.bs = bs;
	}


}
