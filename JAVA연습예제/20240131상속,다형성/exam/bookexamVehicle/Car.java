package exam.bookexamVehicle;

public class Car implements Vehicle {

	// #필드
	private int speed;
	private String type;
	private String color;
	private String model;

	// #생성자
	public Car(int speed, String color, String model, String type) {
		super();
		this.speed = speed;
		this.color = color;
		this.model = model;
		this.type = type;
	}// end of constructor

	// getter / setter
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// #메소드
	@Override
	public void info() {
		System.out.println("현재 " + color + "의 " + type + "모델을 사용하고 있습니다.");
	}// end of info()

	@Override
	public void drive() {
		System.out.println(model + "가 주행중입니다.");
		System.out.println(model + "가 " + speed + "속도로 달립니다.");

	}// end of drive()

}// end of class
