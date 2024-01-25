package class2;

public class Car2Exam {

	public static void main(String[] args) {
		Car2 car1 = new Car2("모델B", 70);
		Car2 car2 = new Car2(90);
		Car2 car3 = new Car2("모델C", "초록", 100);
		Car2 car4 = new Car2("모델D", "노랑");
		Car2 car5 = new Car2("모델E");
		
		
		System.out.println(car1.color);
		System.out.println(car2.model+","+car2.color);
		System.out.println(car3.model+","+car3.color+","+car3.speed);
		System.out.println(car4.speed);
		System.out.println(car5.color+","+car5.speed);
		
	}

}
