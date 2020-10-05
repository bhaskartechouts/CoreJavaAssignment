package org.techouts.app.problem21;

import java.util.Scanner;

public class Operations {

	final int PLUS = 1;
	final int MINUS = 2;
	final int DIVIDE = 3;
	final int MULTIPLY = 4;
	static Scanner scanner = new Scanner(System.in);
	public double calculate() {
		System.out.println("Enter the first Element : ");
		double i = scanner.nextDouble();
		System.out.println("Enter the second Element : ");
		double j = scanner.nextDouble();
		System.out.println("Select the Operation : ");
		System.out.println();
		System.out.println("1.PLUS 2.MINUS 3.DIVIDE 4.MULTIPLY ");
		System.out.println("Enter the Numerical value : ");
		int k = scanner.nextInt();
		switch (k) {
		case  PLUS :  
			return (i+j) ;
		case MINUS :	
			return (i-j) ;
		case DIVIDE :
			return (i/j) ;
		case MULTIPLY :
			return (i*j) ;
		default :
			throw new AssertionError("Entering Wrong Key "); 
		}
	}
	public static void main(String[] args) {
		Operations operations = new Operations();
		System.out.println(operations.calculate());
		scanner.close();
	}
}
