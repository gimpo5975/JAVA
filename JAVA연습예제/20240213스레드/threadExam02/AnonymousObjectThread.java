package threadExam02;

public class AnonymousObjectThread {
//thread 는 객체 생성시에 어떻게 객체를 생성할 수 있는가? => Thread 클래스는 run이 구현되어있음
	public static void main(String[] args) {

		// #1. mainThread
		System.out.println("=== MainThread ===");

		Thread runnableThread = new Thread(new Runnable() {//익명구현객체

			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.print("hello" + "\t");

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					}
				} // end of for
			}// end of run
		});

		runnableThread.start();

		new Thread() {//익명객체
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.print("java" + "\t");

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					}
				} // end of for
			}// end of run
		}.start();

		
		
		Thread test = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.print("sql" + "\t");

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					}
				} // end of for
			}// end of run
		};
		test.start();
		
	}// end of main

}// end of class
