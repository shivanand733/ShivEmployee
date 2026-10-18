package com.empolyee;

public class EmployeeApp {
public static void main(String[] args) {
	Employee e1 = new Employee(1, "Shivanand", 23000.0, "Tender");
	Employee e2 = new Employee(2, "Vishal", 22000.0, "Sales co-Ordinator");
	
	System.out.println("The Employe 1 Detals ");
	e1.displayEmployee();
	System.out.println();
	
	System.out.println("Employee 2 Detals");
	e2.displayEmployee();
	
	System.out.println();
	
	e1.setSalarry(25000.0);
	
	System.out.println();
	
	System.out.println("Updated Sallary Employee1");
	e1.displayEmployee();

} 
	
}
