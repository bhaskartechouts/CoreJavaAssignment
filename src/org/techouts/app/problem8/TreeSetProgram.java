package org.techouts.app.problem8;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetProgram {

	static TreeSet<String> set = new TreeSet<>();
	public static void main(String[] args) {
		checkUpperAndLowwerCase();
	}
	public static void checkUpperAndLowwerCase() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Data : ");
		String s1 = scanner.next();
		char[] ch = s1.toCharArray();
		int upperCase = 0 ;
		int lowerCase = 0 ;
		for(int i = 0 ; i < ch.length ; i ++) {
		if(Character.isUpperCase(ch[i])) {
			upperCase++;
		}
		if(Character.isLowerCase(ch[i])) {
			lowerCase++;
		}
		}
		if(upperCase >= 1 && lowerCase >= 1) {
			set.add(s1);
			System.out.println("Successfully added ");
		}
		else {
			System.out.println("Please Enter Correct Data...");
		}
		System.out.println("Continue to add the Data Enter 'Y' or Teminated Enter 'N'");
		char ch1 = scanner.next().charAt(0);
		if(ch1 == 'Y' || ch1 == 'y') {
			checkUpperAndLowwerCase();
		}
		scanner.close();
	}
}
