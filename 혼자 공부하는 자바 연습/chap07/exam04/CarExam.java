package honggongja.sec07.exam04;

public class CarExam {

	public static void main(String[] args) {

		Car car = new Car();

		// car 객체를 5번 반복 실행시키기
		for (int i = 0; i <= 5; i++) {
			int problemLocation = car.run();

			// 문제가 있는 위치(problemLocation)를 리턴 받아서 처리
			// 앞왼쪽(1),앞오른쪽(2), 뒤왼쪽(3), 뒤오른쪽(4)
			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);// 위치(앞왼쪽)와 최대 회전수(15)
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontLeftTire = new KumhoTire("앞오른쪽", 13);// 위치와 최대 회전수
				break;

			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);// 위치(앞왼쪽)와 최대 회전수(15)
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");	
				car.backRightTire = new KumhoTire("뒤앞오른쪽", 17);// 위치와 최대 회전수
				break;
			}// end of switch

			System.out.println("--------------------------"); // 1회전시 출력되는 내용의 구분선

		} // end of for

	}// end of main

}// end of class
