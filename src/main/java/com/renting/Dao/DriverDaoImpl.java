package com.renting.Dao;
import java.util.*;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class DriverDaoImpl implements DriverDao {
	HashMap<String,List<String>> driverDetails;
	HashMap<String,String> driverMails;
	
	public String getDriver(String carName) {
		driverDetails = new HashMap<>();
		List<String> squada = new ArrayList<String>();
		squada.add("a");
		squada.add("b");
		squada.add("c");
		squada.add("d");
		driverDetails.put("squada", squada);
		List<String> availableDriver = driverDetails.get(carName);
		String name = availableDriver.get(0);
		//availableDriver.remove(name);
		//driverDetails.put(carName, availableDriver);
		return name;
	}

	public String getDriverMail(String driverName) {
		driverMails = new HashMap<>();
		driverMails.put("a","gauravagarwal9501@gmail.com");
		driverMails.put("b","gagaurava8@gmail.com");
		driverMails.put("c","madhu.agarwal822.gmail.com");
		return driverMails.get(driverName);
	}
	
	
}
