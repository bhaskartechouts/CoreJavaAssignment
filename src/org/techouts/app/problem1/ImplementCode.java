package org.techouts.app.problem1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ImplementCode {

	Company company ;
	Employee employee ;
	Scanner scanner = new Scanner(System.in);
	List<Employee> arrayList = new LinkedList<>();
	int everYear;
	String rating;
	int startingYear;
	public void oneToMany() {
		System.out.println("Enter the Company Name : ");
		String companyName = scanner.next();
		System.out.println("Enter the Employee ID : ");
		int employeeID = scanner.nextInt();
		System.out.println("Enter Employee Name : ");
		String employeeName = scanner.next();
		System.out.println("Enter the Starting Year : ");
		startingYear = scanner.nextInt();
		createObject();
		company = new Company(companyName, employeeID, employeeName, arrayList);

		scanner.close();
		System.out.println(company.toString());

	}
	public void createObject() {
		System.out.println("Rating of year Enter the Year : ");
		everYear = scanner.nextInt();
		System.out.println("Enter the Rating : ");
		rating = scanner.next();
		if(employee == null) {
			employee = new Employee(startingYear, everYear, rating);
			arrayList.add(employee);
		}
		else {
			employee = new Employee(startingYear,everYear,rating);
			arrayList.add(employee);
		}
		System.out.println("Continue next year rating Enter Y or Terminated Enter N");
		char ch = scanner.next().charAt(0);
		if(ch == 'Y' || ch == 'y') {
			createObject();
		}

	}
}
