package exam.scoreobjectification;

//Car 필드 정의
class Car {
// 필드
	String brand;
	String model;
	int year;

// 생성자
	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}// end of constructor

	public void displayInfo() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
	}// end of displayInfo()
}// end of class Car

public class CarExam {
	// entry point
	public static void main(String[] args) {
		// Car 객체 생성
		Car car1 = new Car("Toyota", "Camry", 2022);
		Car car2 = new Car("Honda", "Civic", 2020);

		// Car 객체 정보 출력
		System.out.println("Car 1:");
		car1.displayInfo();
		System.out.println("\nCar 2:");
		car2.displayInfo();
	}// end of main

}// end of class
