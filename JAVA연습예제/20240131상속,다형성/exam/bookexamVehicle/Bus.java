package exam.bookexamVehicle;

public class Bus implements Vehicle {

	// #필드
	private int busNumber;
	private int passenger;
	private int busMany;

	// #생성자
	public Bus(int busNumber, int passenger, int busMany) {
		super();
		this.busNumber = busNumber;
		this.passenger = passenger;
		this.busMany = busMany;
	}// end of constructor

	// getter / setter
	public int getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}

	public int getPassenger() {
		return passenger;
	}

	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}

	public int getBusMany() {
		return busMany;
	}

	public void setBusMany(int busMany) {
		this.busMany = busMany;
	}

	//#메소드
	@Override
	public void info() {
		System.out.println(busNumber+"번 버스는 서율 지역만 "+busMany+"대 운행중입니다.");
	}//end of info()

	@Override
	public void drive() {
		System.out.println(busNumber+"번 버스가 승객"+passenger+"명을 태우고 달립니다.");
	}//end of drive()

}//end of class
