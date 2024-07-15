package com.yesbank.restapi.model;

public class EmployeeDTO {
	private String empId;
	private String name;
	private String email;
	public EmployeeDTO(String empId, String name, String email) {
		super();
		this.empId = empId;
		this.name = name;
		this.email = email;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
