package exam.bookexamVehicle;

public class VehicleMain {

	public static void main(String[] args) {

		Vehicle[] vehicle = { new Bus(60, 15, 7), new Car(120, "빨강", "페라리", "전기차") };

		for (Vehicle vh : vehicle) {
			System.out.println("=============================");
			System.out.println("*** 타입 변환해서 값 변경하기 전 ***");
			vh.drive();
			vh.info();

			if (vh instanceof Bus bus) {
				bus.setBusMany(999);
				bus.setBusNumber(7100);
				bus.setPassenger(43);
			} else if (vh instanceof Car car) {
				car.setColor("노랑색");
				car.setModel("람보르기니");
				car.setSpeed(230);
				car.setType("휘발유");
			} // end of if

			System.out.println();
			System.out.println("*** 타입 변환해서 값 변경 후 ***");
			vh.drive();
			vh.info();
		} // end of for-each

	}// end of main

}// end of class
