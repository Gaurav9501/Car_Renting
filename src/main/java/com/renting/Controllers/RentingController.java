package com.renting.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.renting.Dao.*;
import com.renting.Modules.*;

@Controller
public class RentingController {

	@Autowired
	private DriverDao dao;	
	@Autowired
	private SendMail sendMail;
	
	private String getDriver;
	private String driverMail;
	@RequestMapping("/squada")
	public String squada() {
		getDriver = dao.getDriver("squada");
		driverMail = dao.getDriverMail(getDriver);
		System.out.println(getDriver);
		return "squada";
	}
	
	@PostMapping("/process")
	public String process(@ModelAttribute("client") Client client) {
		String message = "Name: "+client.getName()+"\n Address: "+client.getAddress()+"\n From: "+client.getSrDate()+"\n To: "+client.getDtDate();
		
		if(this.sendMail.sendMail(driverMail,message,"Car booking"))
			System.out.println("Booking successfull");
		else
			System.out.println("booking fail");
		return "squada";
	}
	

	@RequestMapping("/base")
	public String base() {
		return "base";
	}

	
	@RequestMapping("/suzuki")
	public void suzuki() {}
	
	@RequestMapping("/maruti")
	public void maruti() {}
	
	@RequestMapping("/honda")
	public void honda() {}
	
	
}
