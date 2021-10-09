package com.renting.Modules;
import java.util.*;

import org.springframework.stereotype.Component;



public class Client {
	private String name;
	private String address;
	private boolean checkbox;
	private String srDate;
	private String dtDate;
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Client(String name, String address, boolean checkbox, String srDate, String dtDate) {
	super();
	this.name = name;
	this.address = address;
	this.checkbox = checkbox;
	this.srDate = srDate;
	this.dtDate = dtDate;
}
	
	
	public boolean isCheckbox() {
		return checkbox;
	}
	public void setCheckbox(boolean checkbox) {
		this.checkbox = checkbox;
	}
	public String getSrDate() {
		return srDate;
	}
	public void setSrDate(String srDate) {
		this.srDate = srDate;
	}
	public String getDtDate() {
		return dtDate;
	}
	public void setDtDate(String dtDate) {
		this.dtDate = dtDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", address=" + address + ", checkbox=" + checkbox + ", srDate=" + srDate
				+ ", dtDate=" + dtDate + "]";
	}
	
	
	
	
}
