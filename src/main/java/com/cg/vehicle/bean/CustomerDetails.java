package com.cg.vehicle.bean;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CustomerDetails {
private int vehicleNo,insurancePeriod,vehicleType;
private String adharNo,mobileNo;
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
LocalDateTime now = LocalDateTime.now();  
public CustomerDetails(int vehicleType2, int insurancePeriod2, String adharNo2, String mobileNo2) {
	// TODO Auto-generated constructor stub
	vehicleType=vehicleType2;
	insurancePeriod=insurancePeriod2;
	adharNo=adharNo2;
	mobileNo=mobileNo2;
}


public CustomerDetails() {
	// TODO Auto-generated constructor stub
}
public int getVehicleNo() {
	return vehicleNo;
}
public void setVehicleNo(int vehicleNo) {
	this.vehicleNo = vehicleNo;
}
public String getAdharNo() {
	return adharNo;
}
public void setAdharNo(String adharNo) {
	this.adharNo = adharNo;
}
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public int getInsurancePeriod() {
	return insurancePeriod;
}
public void setInsurancePeriod(int insurancePeriod) {
	this.insurancePeriod = insurancePeriod;
}
public int getVehicleType() {
	return vehicleType;
}
public void setVehicleType(int vehicleType) {
	this.vehicleType = vehicleType;
}
}
