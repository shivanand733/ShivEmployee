package com.empolyee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeApp {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	ArrayList<Employee> employee = new ArrayList<Employee>();
	
	int choise;
	
	do {
		System.out.println("Empolyee Management System");
		System.out.println("1. Add Employee ");
		System.out.println("2. View Employee");
		System.out.println("3. Update Employee");
		System.out.println("4. Delete Employee");
		System.out.println("5. Exit ");
		System.out.println("Enter your choise");
		
		choise = scan.nextInt();
		scan.nextLine();
		
		switch(choise) {
		case 1: //Create 
			System.out.println("Enter Employee Id");
			int id = scan.nextInt();
			scan.nextLine();
			
			if (findEmployee(employee, id) != null) {
				System.out.println("Employee Id is Allredy Exists!");
				break;
			}
			
			System.out.println("Enter Name");
			String name = scan.nextLine();
			
			System.out.println("Emetr Sallary");
			Double Sallary = scan.nextDouble();
			
			System.out.println("Department");
			String department = scan.nextLine();
			
			Employee emp = new Employee(id, name, Sallary,  department);
			
			employees.add(emp);
			
			
			

public static void findEmployee(ArrayList<Employee> employees, int id) {
	
	for (int i = 0; i < employees.size();i++) {
		Employee e = employees.get(i);
		
		if (e.getId() == id) {
			return e;
		}
	}
	
//	for (Employee e : employees) {
//	    if (e.getId() == id) {
//	        return e;
//	    }
//	}
	
	return null;
}
	
}
