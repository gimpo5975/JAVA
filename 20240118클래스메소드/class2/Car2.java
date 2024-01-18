package class2;

public class Car2 {
	String model;
	String color;
	int speed;

	public Car2() {

	}
	
	public Car2(String model) {
		this(model, "검정", 77);
	}
	
	public Car2(String model, String color) {
		this(model, color, 40);
	}
	
	public Car2(String model, int speed) {
		this(model, "파랑", speed);
	}

	public Car2(int speed) {
		this("모델A", "빨강", speed);
	}
	
	public Car2(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	
}//end of class
