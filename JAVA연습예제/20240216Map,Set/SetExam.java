package setexam;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetExam {

	// entry point
	public static void main(String[] args) {

		// Set타입 HashSet 객체 생성
		Set<String> set = new HashSet<String>();

		// HashSet 타입으로 강제 타입 변환
//		HashSet<String> childSet = (HashSet<String>) set;

		set.add("java");
		set.add("jdbc");
		set.add("jsp/servlet");
		set.add("java");
		set.add("jdbc");

		System.out.println(set.size());// 3

		Set<Integer> setInt = new HashSet<Integer>();
		setInt.add(30);
		setInt.add(40);
		setInt.add(30);

		System.out.println(setInt.size());// 2

		Set<Car> car = new HashSet<Car>();
		car.add(new Car("노랑"));
		car.add(new Car("파랑"));
		car.add(new Car("노랑"));
		car.add(new Car("파랑"));

		System.out.println(car.size());// 2

		
		
		
	}// end of main

}// end of class

class Car {
	// #field
	String color;

	// #constructor
	Car(String color) {
		this.color = color;
	}// end of constructor

	@Override
	public int hashCode() {
		return Objects.hash(color);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(color, other.color);
	}
	
	
}// end of car
