package com.cg.vehicle.dao;

import java.sql.Date;

import com.cg.vehicle.bean.CustomerDetails;

public interface RegistrationDao {
 public CustomerDetails register(CustomerDetails c);
 public int insuranceValid(CustomerDetails c,Date date);
}
