package com.example.demo.modelS;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Smodel{
	@Id
	private int id;
	private String shipname;
	private String shiparrival;
	private String Shipdepature;
	private String Shipticket;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShipname() {
		return shipname;
	}
	public void setShipname(String shipname) {
		this.shipname = shipname;
	}
	public String getShiparrival() {
		return shiparrival;
	}
	public void setShiparrival(String shiparrival) {
		this.shiparrival = shiparrival;
	}
	public String getShipdepature() {
		return Shipdepature;
	}
	public void setShipdepature(String shipdepature) {
		Shipdepature = shipdepature;
	}
	public String getShipticket() {
		return Shipticket;
	}
	public void setShipticket(String shipticket) {
		Shipticket = shipticket;
	}
	
	
	
	
	

}