package org.techouts.app.problem4;

import java.util.ArrayList;

public class Programs {

	 public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Bhaskar");
		arrayList.add("Lekkala");
		arrayList.add("Techouts");
		arrayList.add("Bhaskar");
		System.out.println(arrayList.hashCode());
		System.out.println(arrayList.toString());
		String s = "123";
		int i = Integer.parseInt(s);
		System.out.println(i);
		String s2 = "123";
		if(s.equals(s2)) {
			System.out.println(s + " is Equals to " + s2); 
		}
		else {
			System.out.println(s + " is Not Equals to " + s2); 
		}
		Equals equals = new Equals();
		Equals equals2 = new Equals();
		if(equals.equals(equals2)) {
			System.out.println("Objects are Equals to " ); 
		}
		else {
			System.out.println("Objects are Not Equals to "); 
		}
	}
}
