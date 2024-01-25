package chap08_2;

public class CarExam {

	public static void main(String[] args) {

		Car car = new Car();

		car.run();

		car.frontLeftTire = new KumhoTire();
		car.frontRightTire = new KumhoTire();
		
		System.out.println("앞바퀴 교체중.....");
		car.run();

	}// end of main

}// end of class
