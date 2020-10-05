package org.techouts.app.problem3;

public class AnonymousInnerClass {
	
	public static void main(String[] args) {
		Example example = new Example() {
			
			@Override
			public void run() {

				System.out.println("Running");
			}
		};
		example.run();
	}
}
