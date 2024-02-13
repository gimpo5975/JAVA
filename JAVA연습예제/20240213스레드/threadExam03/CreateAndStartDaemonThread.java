package threadExam03;

public class CreateAndStartDaemonThread {

	public static void main(String[] args) {

		// #1. 메인 쓰레드
		System.out.println("main Thread");

//		//#2. 쓰레드 객체 생성 및 실행
//		
//		Runnable daemonThread = new TestDaemon();
//		Thread testDaemon = new Thread(daemonThread);
//		
//		testDaemon.start();
//		
//		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			System.out.println("쓰레드 예외 발생");
//		}

		// #2. 쓰레드 객체 생성 및 실행

		Runnable daemonThread = new TestDaemon();
		Thread testDaemon = new Thread(daemonThread);

		testDaemon.setDaemon(true);//데몬 쓰레드로 설정
									// 주의 할 점: 반드시 start()메소드 보다 먼저 선언 되야 한다
		
		testDaemon.start();//쓰레드 실행

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("쓰레드 예외 발생");
		}

		System.out.println("=== end of mainThread === ");

	}// end of main

}// emd of class
