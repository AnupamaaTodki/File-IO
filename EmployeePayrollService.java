package com.javafileio;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollService {
	private ArrayList<EmployeePayroll> empList = new ArrayList<>();
	EmployeePayroll employeeData;
	Scanner scanner = new Scanner(System.in);

	public void readEmployeeData() {
		System.out.println("Enter id = ");
		int id = scanner.nextInt();
		System.out.println("Enter name = ");
		String name = scanner.next();
		System.out.println("Enter salary = ");
		double salary = scanner.nextDouble();
		empList.add(new EmployeePayroll(id, name, salary)) ;
	}
	public void printData() {
		System.out.println("Employee Data");
		System.out.println(empList);
	}
	
	public static void main(String[] args) {
		EmployeePayrollService emp = new EmployeePayrollService();
		emp.readEmployeeData();
		emp.printData();
	}
}
