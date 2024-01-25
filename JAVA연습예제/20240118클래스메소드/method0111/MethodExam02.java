package method;

public class MethodExam02 {

	public static void main(String[] args) {
		produce(10);// 메소드 호출
		produce2(3, "안녕");
		//두 정수를 넘겨주고 그 곱셈 결과를 되돌려 받아서 출력
		int result = multiplication(10, 10);//메소드명(매개변수1,매개변수2) = 메소드를 호출
		System.out.println(result);
		
	}// end of main

	// #메소드 정의
	// 매개변수, 파라미터
	public static void produce(int count) {
		for (int i = 1; i <= count; i++) {
			System.out.println("MY NAME IS KIMWONJUNG");
		}
		return;// 일반적으로 생략되어있음
	}// end of hello()

	// #메소드를 정의
	public static void produce2(int count, String message) {
		for (int i = 1; i <= count; i++) {
			System.out.println("나는 원중이야 " + message);
		} // end of for
		return;// 일반적으로 생략되어있음
	}// end of produce2
	
	//#메소드를 정의
	public static int multiplication(int x, int y) {
		int rs = x * y;
		return rs;//호출받은 두 값을 곱한 값을 넘겨줌
	}//end of multiplication
	
	
}// end of class
