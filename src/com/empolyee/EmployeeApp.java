package com.empolyee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeApp {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	ArrayList<Employee> employees = new ArrayList<Employee>();
	
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
			
			if (findEmployee(employees, id) != null) {
				System.out.println("Employee Id is Allredy Exists!");
				break;
			}
			
			System.out.println("Enter Name");
			String name = scan.nextLine();
			
			System.out.println("Enter Sallary");
			Double Sallary = scan.nextDouble();
			scan.nextLine();
			
			System.out.println(" Enter Department");
			String department = scan.nextLine();
			
			Employee emp = new Employee(id, name, Sallary, department);
		
			employees.add(emp);
		
			System.out.println("Employee Add Successfully!");
			
			//new Line 
			System.out.println();
			
			break;
			
		case 2:
			//Read
			if (employees.isEmpty()) {
				System.out.println("No Employye Found!..");
				
			} else  {
				System.out.println("Empolyee Details");
				
				for (Employee e : employees) {
					e.displayEmployee();
					
					System.out.println(" ------------------ ");
				}
			}
			
			//new Line 
			System.out.println();
			break;
			
		case 3: 
			//update 
			System.out.println("Enter Emplyee id to update..");
			int updateId = scan.nextInt();
			scan.nextLine();
			
			Employee updateEmp = findEmployee(employees, updateId);
			
			if (updateEmp != null) {
				System.out.println("Enter New Name: ");
				updateEmp.setName(scan.nextLine());
				
				System.out.println("Enter New Sallary: ");
				updateEmp.setSalarry(scan.nextDouble());
				scan.nextLine();
				
				System.out.println("Enter New Department: ");
				updateEmp.setDepartment(scan.nextLine());
				
				System.out.println("Employee Updated Successfully..!");
				//new Line 
				System.out.println();
			} else {
				System.out.println("Employee not found!...");
				//new Line 
				System.out.println();
			}
			
			
		case 4:
			//Delete 
			System.out.println("Emetr the Employee id to Delete..");
			int deleteId = scan.nextInt();
			scan.nextLine();
			
			Employee deleteEmp  = findEmployee(employees, deleteId);
			
			if (deleteEmp != null) {
				employees.remove(deleteEmp);
				System.out.println("Employee deleted Successfully!..");
				
				//new Line 
				System.out.println();
				
			} else {
				System.out.println("Employee is not found!..");
				
				//new Line 
				System.out.println();
			}
			
			break;
			
		case 5: 
			System.out.println("Thank You for using this System!..");
			
			//new Line 
			System.out.println();
			break;
			
			default:
				 System.out.println("Invalid choise! Try Again..");
				 
				//new Line 
					System.out.println();
	      }

    } while (choise != 5);

    scan.close();
}
			

public static Employee findEmployee(ArrayList<Employee> employees, int id) {
	
//	for (int i = 0; i < employees.size();i++) {
//		Employee e = employees.get(i);
//		
//		if (e.getId() == id) {
//			return e;
//		}
//	}
	
	for (Employee e : employees) {
	    if (e.getId() == id) {
	        return e;
	    }
	}
	
	return null;
}
	
}
