package com.webservice.WebConnectionApp.Bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class EmployeeBean {

	private int id;
	private String employeeName;
	private String address;
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
