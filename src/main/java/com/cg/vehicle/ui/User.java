package com.cg.vehicle.ui;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.cg.vehicle.bean.CustomerDetails;
import com.cg.vehicle.service.RegistrationService;
import com.cg.vehicle.service.RegistrationServiceImpl;

import Exception.RegistrationFail;

public class User {
	 static Date date=new Date(0);
	// System.out.println(date.toString());
static CustomerDetails c=new CustomerDetails();
static Scanner sc=new Scanner(System.in);
static RegistrationService rs=new RegistrationServiceImpl();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

do
{
System.out.println("enter ur choice");
int ch=sc.nextInt();
switch(ch)
{
case 1:c= setInfo();
if(rs.register(c)!=null)
{
	// DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
	/// LocalDateTime now = LocalDateTime.now(); 
	
	System.out.println("registration succesfull on"+date.toString() );
}
else
{
	try {
		throw new RegistrationFail();
	} catch (RegistrationFail e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
break;
case 2:int r=rs.insuranceValid(c,date);
System.out.println("renewal  after "+r+" days");
case 3:System.exit(0);
break;
}
}while(true);
	}

	
	
public static CustomerDetails	setInfo()
{
	System.out.println("enter vehicle num");
	c.setVehicleNo(sc.nextInt());
	System.out.println("enter vehile type");
	c.setVehicleType(sc.nextInt());
	System.out.println("enter insurance period");
	c.setInsurancePeriod(sc.nextInt());
	System.out.println("enter adhar num");
	c.setAdharNo(sc.next());
	System.out.println("enter mobile num");
	c.setMobileNo(sc.next());
	
	return c;
}
}
