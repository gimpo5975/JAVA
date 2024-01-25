package honggongja.sec07.exam04;

public class KumhoTire extends Tire {

	// 생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation); // 부모 Tire 객체를 호출, 매개값을 가져감.
	}

	// 메소드
	@Override // 재정의 - 부모 것을 고쳐 쓴다
	public boolean roll() { // roll() 메소드의 리턴 타입 : boolean
		accumlatedRotation++; // ++accumlatedRotation , 1번 실행할 때마다 누적 회전수가 1식 증가
		if (accumlatedRotation < maxRotation) { // 누적회전수 < 최대 회전수
			// 어느 위치에 타이어 수명이 ~~회 남음을 표시
			System.out.println(location + " KumhoTire 수명: " + (maxRotation - accumlatedRotation) + "회");
			result = true;
//	         return true;
		} else { // 누적회전수 == 최대 회전수 일때, 펑크 출력

			// ~~위치의 타이어가 펑크 남을 표시
			System.out.println("*** " + location + " KumhoTire 펑크 ***");

			result = false;
			// return false;
		}

		return result;

	}// end of roll()
}// end of class
