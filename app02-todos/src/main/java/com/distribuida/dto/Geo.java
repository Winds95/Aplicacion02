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
@Table(name="geo")
@NamedQueries({@NamedQuery(name = "Geo.findAll", query = "SELECT o FROM Geo o"),
@NamedQuery(name = "Geo.findById", query = "SELECT o FROM Geo o WHERE o.id = :id")})
public class Geo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_geo")
	private Integer id_geo;
	
	@Column(name = "latitude")
	private String latitude;
	
	@Column(name = "longitude")
	private String longitude;
	

	public Integer getId_geo() {
		return id_geo;
	}

	public void setId_geo(Integer id_geo) {
		this.id_geo = id_geo;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}


}
