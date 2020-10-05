package org.techouts.app.problem5;

public class Run {

	private static Run rv;
	private Run() {
       System.out.println("Inside Run Class Constant");
	}
	public void test() {
		System.out.println("In Side Test");
	}
	public static Run getObject() {
		if(rv == null) {
			rv = new Run();
		}
		return rv;
	}
}
