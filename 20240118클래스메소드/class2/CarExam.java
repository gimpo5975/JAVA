package class2;

public class CarExam {

	public static void main(String[] args) {
		Car myCar = new Car();//객체 생성, new연산자로 heap에 객체를 생성하고 Car()생성자로 초기화를 한 후에 myCar에 주소저장
		Car myCar2 = new Car();//객체 생성, new연산자로 heap에 객체를 생성하고 Car()생성자로 초기화를 한 후에 myCar2에 주소저장
		
		myCar.show();//Car클래스의 show()메소드 호출
		
		System.out.println("myCar.company : " + myCar.company + " | myCar2.company : " + myCar2.company);
		System.out.println("myCar.model : " + myCar.model +" | myCar.mode2 : " + myCar2.model );
		System.out.println("myCar.color : " + myCar.color + " | myCar2.color : " + myCar2.color);
		System.out.println("myCar.maxSpeed : " + myCar.maxSpeed + " | myCar2.maxSpeed : " + myCar2.maxSpeed);
		System.out.println("myCar.speed : " + myCar.speed + " | myCar2.speed : " + myCar2.speed);
		System.out.println();
		
		myCar.company = "원중 싸이클";
		myCar.speed = 600;
		System.out.println("myCar.company : " + myCar.company);
		System.out.println("myCar.speed : " + myCar.speed);
		System.out.println("myCar2.company : " + myCar2.company);
		System.out.println("myCar2.speed : " + myCar2.speed);
		myCar.show();
	}// end of main

}// end of class
