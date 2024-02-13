package threadExam02;

public class CreateAndStartThreadRunnable {

	public static void main(String[] args) {

		// #1. main Thread
		System.out.println("main Thread");

		// #2. create MovieRunnable instance and start
		Runnable movieRunnable = new MovieRunnable();
		Thread movieThread = new Thread(movieRunnable);
		movieThread.start();

		// #3. create SubtitleRunnable instance and start
		Runnable subtitleRunnable = new SubtitleRunnable();
		Thread subtitleThread = new Thread(subtitleRunnable);
		subtitleThread.start();

		// #4. MainThread part
		try {
			Thread.sleep(3000);// stop for 3seconds
		} catch (InterruptedException e) {
		}

		System.out.println();
		System.out.println("---------------");
		System.out.println("end of MainThread");

	}// end of main

}// end of class
