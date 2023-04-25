package com.example.day1.bikes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bikes")
public class bikeinfo {
	@Id
	@Column(name="bname")
private String bname;
private String bmodel;
private int cc;
private int bcompany;
private String engine;
private String abs;
private int mileage;
private String colour;

public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public String getBmodel() {
	return bmodel;
}
public void setBmodel(String bmodel) {
	this.bmodel = bmodel;
}
public int getCc() {
	return cc;
}
public void setCc(int cc) {
	this.cc = cc;
}
public int getBcompany() {
	return bcompany;
}
public void setBcompany(int bcompany) {
	this.bcompany = bcompany;
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
public int getMileage() {
	return mileage;
}
public void setMileage(int mileage) {
	this.mileage = mileage;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}


}
