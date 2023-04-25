package com.example.demo.bikes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BikeInfo")
public class bikes {
	@Id
	@GeneratedValue
	@Column(name="BikeID")
	private int bikeId;
	public int getBikeId() {
		return bikeId;
	}
	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}
	@Column(name="bname")
	private String bikename;
	@Column(name="cubiccapacity")
	private int cc;
	@Column(name="ename")
	private String engine;
	@Column(name="channel")
	private String abs;
	@Column(name="colour")
	private String colour;
	@Column(name="speed")
private int topspeed;
	@Column(name="price")
private int price;
	@Column(name="version")
private String variant;
	@Column(name="company")
	private String company;
public String getBikename() {
	return bikename;
}
public void setBikename(String bikename) {
	this.bikename = bikename;
}
public int getCc() {
	return cc;
}
public void setCc(int cc) {
	this.cc = cc;
}
public String getEngine() {
	return engine;
}
public void setEngine(String engine) {
	this.engine = engine;
}
public String getAbs() {
	return abs;
}
public void setAbs(String abs) {
	this.abs = abs;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public int getTopspeed() {
	return topspeed;
}
public void setTopspeed(int topspeed) {
	this.topspeed = topspeed;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getVariant() {
	return variant;
}
public void setVariant(String variant) {
	this.variant = variant;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}


}
