package honggongja.sec07.exam01;

public class SupersonicAirplaneExam {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();//이륙
		sa.fly();//일반비행
		sa.flymode = SupersonicAirplane.SUPERSONIC;//초음속비행 모드
		sa.fly();//초음속비행
		sa.flymode = SupersonicAirplane.NORMAL;//일반비행 모드
		sa.fly();//일반비행
		sa.land();//착륙
		
		
	}//end of main

}//end of class
