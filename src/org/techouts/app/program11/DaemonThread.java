package org.techouts.app.program11;

public class DaemonThread implements Runnable {

	
	public static void main(String[] args) {
		DaemonThread daemonThread=new DaemonThread();
		Thread thread = new Thread(daemonThread);
		thread.setName("Bhaskar");
		System.out.println("Thread_1 after creating : "+ thread.getState());
		
		thread.setPriority(3);
		thread.setDaemon(true);
		Thread thread2 = new Thread(daemonThread);
		thread2.setPriority(2);
		System.out.println("Thread_2 after creating : "+ thread2.getState());
		
		Thread thread3 = new Thread(daemonThread);
		thread3.setPriority(1);
		System.out.println("Thread_3 after creating : "+ thread3.getState());
		
		thread.start();
		thread2.start();
		thread3.start();
		System.out.println("Thread_1 after start method Status : "+ thread.getState());
		System.out.println("Thread_2 after start method Status : "+ thread2.getState());
		System.out.println("Thread_3 after start method Status : "+ thread3.getState());
		try {
			thread.sleep(3000);
			System.out.println("Thread_1 after sleep method Status : "+ thread.getState());
			thread2.sleep(5000);
			System.out.println("Thread_2 after sleep method Status : "+ thread2.getState());
			thread3.sleep(9000);
			System.out.println("Thread_3 after sleep method Status : "+ thread3.getState());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void run() {
		System.out.println("The current thread name is : "+ Thread.currentThread().getName());
		System.out.println("The current thread priority is : "+ Thread.currentThread().getPriority());
		System.out.println("The current thread is daemon or not : " + Thread.currentThread().isDaemon());
		
	}

}
