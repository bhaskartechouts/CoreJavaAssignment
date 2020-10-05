package org.techouts.app.problem10;

import java.util.Scanner;

public class ThreadCreated implements Runnable{

	static Scanner scanner = new Scanner(System.in);
	public void add() {
		System.out.println("Enter the Addition Element No.1 : ");
		int i = scanner.nextInt();
		System.out.println("Enter the Addition Element No.2 : ");
		int j = scanner.nextInt();
		int add = i+j;
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					System.out.println("Total Addition Value : "+ add);
					System.out.println();
				} catch (Exception e) {
					System.out.println(e);
				}

			}
		}

				);
		thread.setPriority(3);
		thread.start();

	}
	public void avg() {

		Thread thread2=new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					int l;
					double sum = 0 ;
					System.out.println("Enter the No. of elements : ");
					int j = scanner.nextInt();
					System.out.println("Enter the "+j+" Elements");
					for(int i = 1 ;i <= j;i++) {
						System.out.println("Enter "+i+" Element ");
						l = scanner.nextInt();
						sum = sum + l ;
					}
					System.out.println("Avg Value : "+sum/j );
					System.out.println();
				} catch (Exception e) {
					System.out.println(e);
				}

			}
		});	
		thread2.setPriority(2);
		thread2.start();

	}
	public void display() {
		Thread thread3=new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					add();
					avg();

				} catch (Exception e) {
					System.out.println(e);
				}

			}
		});
		thread3.setPriority(1);
		thread3.start();
		scanner.close();
	}
	@Override
	public void run() {
		display();

	}
}