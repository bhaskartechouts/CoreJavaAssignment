package org.techouts.app.problem19;

import java.util.Scanner;

public class TestUserNameException {

	static Scanner scanner = new Scanner(System.in);
	static void validate(String name)throws InvalidUserNameException{  
		int status = 0 ;
		char[] ch = name.toCharArray();
		for(char ch1 : ch) {
			if(ch1 == '&') {
				status++;
			}
		}
		
	     if(name.length() < 10 || status > 0 )  {
	      throw new InvalidUserNameException("UserName Not Valid");  
	     }
	     else  {
	      System.out.println("UserName Valid");  
	     }
	   }  
	     
	   public static void main(String args[]){  
		   System.out.println("Enter The User Name : ");
		   String name = scanner.next();
	      try{  
	      validate(name);  
	      }catch(Exception m){System.out.println("Exception occured: "+m);}  
	      scanner.close();
	  }  
}
