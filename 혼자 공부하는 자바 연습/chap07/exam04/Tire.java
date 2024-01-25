package honggongja.sec07.exam04;

public class Tire {
	// #1. 필드
	public int maxRotation;// 최대 회전수, 타이어의 수명, 최대 회전수에 도달하면 타이어 펑크
	public int accumlatedRotation;// 누적 회전수, 타이어가 1번 회전할 떄마다 1씩 증가
									// 누적 회전수 = 최대 회전수 => 타이어펑크
	public String location;// 타이어 위치, 앞왼쪽, 앞오른쪽, 뒤왼쪽, 뒤오른쪽
							// 앞왼쪽 : frontLeftTire
							// 앞오른쪽 : frontRightTire
							// 뒤왼쪽 : backLeftTire
							// 뒤오른쪽 : backRightTire

	// #2. 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}// end of Tire()

	// #3. 메소드
	// roll()메소드는 타이어를 1회전시키는 메소드, 1번 실행할 때마다 누적 회전수가 1식 증가
	// 누적회전수 < 최대 회전수 : 남은 회전수를 출력
	// 누적회전수 == 최대 회전수 : 펑크 출력
	// if(누적회전수 < 최대 회전수){
	// return true;
	// }else(누적회전수 == 최대 회전수){
	// return false;
	// }
	// roll() 메소드의 리턴 타입 : boolean
	// 정상이면 true
	// 펑크 : false

	boolean result = false;

	public boolean roll() {// roll() 메소드의 리턴 타입 : boolean
		accumlatedRotation++;// 누적 회전수, 타이어가 1번 회전할 떄마다 1씩 증가
		if (accumlatedRotation < maxRotation) {// 누적회전수 < 최대 회전수 : 남은 회전수를 출력
			// location에 타이어 남은 수명 출력 최대회전수- 누적회전수
			System.out.println(location + "타이어 수명 : " + (maxRotation - accumlatedRotation) + "회");
			result = true;
		} else {// 누적회전수 == 최대 회전수 : 펑크 출력
			System.out.println("***" + location + "타이어 펑크 ***");
			result = false;
		} // end of if
		return result;

	}// end of roll()

}// end of class
