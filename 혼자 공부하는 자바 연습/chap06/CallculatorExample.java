package honggongja.sec06;

public class CallculatorExample {

	public static void main(String[] args) {
		//정적 멤버 사용
		//객체를 사용하지 않고도 정적 필드와 정적 메소드 사용 가능하다=>  클래스 이름으로 참조해서
		double result1 = 10 * 10 * Callculator.pi;//정적 필드 호출
		int result2 = Callculator.plus(5, 5);//정적 메소드 호출
		int result3 = Callculator.minus(6, 5);//정적 메소드 호출

		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}// end of main

}// end of class
