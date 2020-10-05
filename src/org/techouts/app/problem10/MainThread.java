package org.techouts.app.problem10;

public class MainThread extends Thread{

	public static void main(String[] args) {
		ThreadCreated created = new ThreadCreated();
		Thread thread = new Thread(created);
		thread.start();
		
	}
}
