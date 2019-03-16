package com.cg.vehicle.service;

import java.sql.Date;

import com.cg.vehicle.bean.CustomerDetails;
import com.cg.vehicle.dao.RegistrationDao;
import com.cg.vehicle.dao.RegistrationDaoImpl;

import Exception.Invalid;

public class RegistrationServiceImpl implements  RegistrationService{

	RegistrationDao rd= new RegistrationDaoImpl();
	public CustomerDetails register(CustomerDetails c) {
		// TODO Auto-generated method stub
		
		
		
		if(c.getMobileNo().length()==10&&c.getAdharNo().length()==12)
		{
			
		
		return rd.register(c);
		}
		else 
		{
			 try {
				throw new Invalid();
			} catch (Invalid e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 return null;
		}
	}

	public int insuranceValid(CustomerDetails c,Date date) {
		// TODO Auto-generated method stub
		return rd.insuranceValid(c, date);
	}

}
