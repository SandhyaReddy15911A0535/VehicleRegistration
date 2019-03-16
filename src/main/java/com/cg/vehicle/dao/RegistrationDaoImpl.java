package com.cg.vehicle.dao;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;

import com.cg.vehicle.bean.CustomerDetails;

public class RegistrationDaoImpl  implements RegistrationDao{
	
	public CustomerDetails register(CustomerDetails c) {
		// TODO Auto-generated method stub
		HashMap<Integer,CustomerDetails> hm=new HashMap<Integer,CustomerDetails>();
		hm.put(c.getVehicleNo(),new CustomerDetails(c.getVehicleType(),c.getInsurancePeriod(),c.getAdharNo(),c.getMobileNo()));
	
	// HashMap<Integer, DateTimeFormatter> hm1=new HashMap<Integer, DateTimeFormatter>();
	// hm1.put(c.getVehicleNo(), dtf);
	return c;
	}

	public int insuranceValid( CustomerDetails c,Date date)
	{
		// TODO Auto-generated method stub
		int renewal=c.getInsurancePeriod()*365;
		return renewal;   
	}

}


