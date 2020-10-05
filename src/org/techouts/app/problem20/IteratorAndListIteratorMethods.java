package org.techouts.app.problem20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class IteratorAndListIteratorMethods {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
	      arrayList.add("Apple");
	      arrayList.add("Mango");
	      arrayList.add("Guava");
	      arrayList.add("Orange");
	      arrayList.add("Peach");
	      System.out.println("The ArrayList elements are: ");
	      for (String s: arrayList) {
	         System.out.println(s);
	      }
	      Iterator iterator = arrayList.iterator();
	      String str = "";
	      while (iterator.hasNext()) {
	         str = (String) iterator.next();
	         if (str.equals("Orange")) {
	            iterator.remove();
	            System.out.println("The element Orange is removed");
	            break;
	         }
	      }
	      for (String s: arrayList) {
	         System.out.println(s);
	      }
	      ListIterator<String> listIterator = arrayList.listIterator();
	      while(listIterator.hasNext()) {
	    	  System.out.println(listIterator.next());
	      }
	      listIterator.add("Orange");
	      while(listIterator.hasPrevious()) {
	    	  System.out.println(listIterator.previous());
	    	  System.out.println(listIterator.previousIndex());
	      }
	      while (listIterator.hasNext()) {
		         str = (String) listIterator.next();
		         if (str.equals("Orange")) {
		            listIterator.set("Popaya");
		            System.out.println("The element Orange is Set to Popaya");
		            break;
		         }
		      }
	      ListIterator<String> listIterator1 = arrayList.listIterator();
	      while(listIterator1.hasNext()) {
	    	  System.out.println(listIterator1.next());
	    	  System.out.println(listIterator1.nextIndex());
	      }
	}
}
