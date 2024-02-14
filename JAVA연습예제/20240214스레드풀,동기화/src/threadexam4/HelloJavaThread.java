package threadexam4;

import static threadexam4.SleepShow.*;

public class HelloJavaThread implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i <= 5; i++) {
			sleepShow(500);
			System.out.println("Hello~~~");
		} // end of for

	}// end of run

}// end of class
