package com.cg.vehicle.service;

import java.sql.Date;

import com.cg.vehicle.bean.CustomerDetails;

public interface RegistrationService {

	 public CustomerDetails register(CustomerDetails c);
	 public int insuranceValid(CustomerDetails c,Date date);
}
