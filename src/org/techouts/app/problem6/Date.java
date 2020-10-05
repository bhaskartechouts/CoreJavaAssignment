package org.techouts.app.problem6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class Date {

	public static void main(String args[]) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Year : ");
		int year = scanner.nextInt();
		System.out.println("Enter the month : ");
		int month = scanner.nextInt();
		System.out.println("Enter the day of Month : ");
		int dayOfMonth = scanner.nextInt();
		LocalDate date = LocalDate.now();
		LocalDate enterDate = LocalDate.of(year, month, dayOfMonth);
		System.out.println("Present Date " + date);

		System.out.println("Entering Date : "+enterDate);
		
		if (date.compareTo(enterDate) > 0) {
			System.out.println(date+" occurs after "+enterDate);
		} 
		else if (date.compareTo(enterDate) < 0) {
			System.out.println(date+" occurs before "+enterDate);
		} 
		else if (date.compareTo(enterDate) == 0) {
			System.out.println("Both are same dates");
		} 
		else {
			System.out.println("You seem to be a time traveller !!");
		}  
		String s1 = year+"/"+month+"/"+dayOfMonth+"/ 00:00:00Z";
		java.util.Date  date3 = new SimpleDateFormat("dd/MM/yyyy").parse(s1);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");
		String s2= format.format(date3);
		System.out.println(s2);
		scanner.close();
	}
}
