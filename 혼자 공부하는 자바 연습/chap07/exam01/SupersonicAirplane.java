package honggongja.sec07.exam01;

public class SupersonicAirplane extends Airplane {

	public static final int NORMAL = 1;// 자주 사용되는 고정값들은 상수를 사용해서 가독성을 높여준다
	public static final int SUPERSONIC = 2;// 자주 사용되는 고정값들은 상수를 사용해서 가독성을 높여준다

	public int flymode = NORMAL;

	@Override // 부모클래스의 fly()메소드 재정의
	public void fly() {
		if (flymode == SUPERSONIC) {
			System.out.println("초음속 비행합니다");
		} else {
			super.fly();// 부모클래스의 fly()메소드 호출
		} // end of if
	}// end of fly()
}// end of class
