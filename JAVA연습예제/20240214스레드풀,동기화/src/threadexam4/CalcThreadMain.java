package threadexam4;

public class CalcThreadMain {

	public static void main(String[] args) {

		System.out.println("MainThread");

		CalcThread calc = new CalcThread();
		calc.start();

		try {
			calc.join();
		} catch (InterruptedException e) {
			System.out.println("Exception occurred");
		}

		System.out.println("=========================");
		System.out.println("Sum from 1 to 100 : " + calc.getSum());

	}// end of main

}// end of class
