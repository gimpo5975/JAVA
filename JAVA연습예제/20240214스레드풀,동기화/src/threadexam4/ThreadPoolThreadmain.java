package threadexam4;

import static threadexam4.SleepShow.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolThreadmain {

	public static void main(String[] args) {

		System.out.println("== main Thread ==");

		// #Create Anonymous Object
		Thread runnableThreadPool = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println("Hi! Java!!");
					sleepShow(1000);
				} // end of for
			}// end of run
		});// end of new Thread

		// #Create Thread Pool
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(runnableThreadPool);

		// #Main Thread Work
		System.out.println("== Main ==");
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hi! Have a fun~~");
			sleepShow(1000);
		} // end of for

		System.out.println("== End of Main ==");

		// #End of Thread Pool
		exec.shutdown();// If this is not called, it will not terminate

	}// end of main

}// end of class
