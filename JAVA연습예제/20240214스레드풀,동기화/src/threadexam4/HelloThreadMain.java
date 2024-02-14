package threadexam4;

import static threadexam4.SleepShow.*;

public class HelloThreadMain {

	public static void main(String[] args) {

		System.out.println("👋👋main Thread👋👋");

		// create Thread instance
		Runnable hellojava = new HelloJavaThread();
		Thread helloJava = new Thread(hellojava);
		helloJava.setDaemon(true);// Set to daemon thread

		// Thread execution
		helloJava.start();

		// main Thread work
		for (int i = 1; i <= 5; i++) {
			sleepShow(500);

			System.out.println("Java~~~");
		} // end of for

		System.out.println("👋👋end of main Thread👋👋");

	}// end of main

}// end of class
