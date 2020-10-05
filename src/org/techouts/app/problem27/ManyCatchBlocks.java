package org.techouts.app.problem27;

public class ManyCatchBlocks {

	public static void main(String args[]) {
		int i = 0, j = 99;
		int k[] ={1,2,3,4,5};
		String s = null;
		try {
			System.out.println(j/i);
			System.out.println("Hey I'm at the end of try block");
		}
		catch (ArithmeticException e) { 
			System.out.println("You should not divide a number by zero"+ e);
			System.out.println((j/(i+1)));
			try {
				System.out.println(k[99]);
			} catch (IndexOutOfBoundsException e1) {
				System.out.println(e1);
			}
			
		}
		
		catch (Exception e) {
			System.out.println("Exception occurred");
		}
		finally {
			System.out.println("finally block all way excuted");
		}

	}
}
