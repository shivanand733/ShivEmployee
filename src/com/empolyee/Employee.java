package com.empolyee;

public class Employee {

	//Employee Data
	private int id;
	private String name;
	private Double salarry;
	private String department;
	
	public Employee(int id, String name, Double salarry, String department) {
		this.id = id;
		this.name = name;
		this.salarry = salarry;
		this.department = department;
	}
	
	//getters 
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Double getSalarry() {
		return salarry;
	}
	public String getDepartment() {
		return department;
	}
	
	//setters 
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalarry(Double salarry) {
		this.salarry = salarry;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	public void displayEmployee() {
		System.out.println("Id " + id);
		System.out.println("Name " + name);
		System.out.println("Sallary " + salarry);
		System.out.println("Department " + department);
		}
}
