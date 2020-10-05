package org.techouts.app.problem22;

import java.util.Scanner;

public interface Company {

	static Scanner scanner = new Scanner(System.in);
	default double profit() {
		System.out.println("Enter the CP : ");
		double CP = scanner.nextDouble();
		System.out.println("Enter the SP : ");
		double SP = scanner.nextDouble();
		return (SP-CP);
	}
	public static String companyName(double profit) {
		System.out.println("Enter the Company Name : ");
		String name=scanner.next();
		return name;

	}
	public abstract String getcompanydetails(double profit,String companyName);
}
