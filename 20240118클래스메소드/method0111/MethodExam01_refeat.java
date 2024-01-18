package method;

public class MethodExam01_refeat {

	public static void main(String[] args) {

		System.out.println("1~5까지의 합: " + sumCall(1, 5));// 1~5까지의 합 => sumCall()메소드를 호출한다 #1, 5는 매개값, 인자
		System.out.println("1~10까지의 합: " + sumCall(1, 10));// 1~10까지의 합 => sumCall()메소드를 호출한다 #1, 10는 매개값, 인자
		System.out.println("50~100까지의 합: " + sumCall(50, 100));// 50~100까지의 합 => sumCall()메소드를 호출한다 #50, 100는 매개값, 인자
		System.out.println("35~75까지의 합: " + sumCall(35, 75));// 35~75까지의 합 => sumCall()메소드를 호출한다 #35, 75는 매개값, 인자
		showInfo();// showInfo()메소드를 호출한다
		printShow(100);// printShow()메소드를 호출한다

	}// end of main

	public static int sumCall(int start, int end) {// start, end : 매개변수, 파라미터
		int sum = 0;
		for (int i = start; i < end; i++) {
			sum += i;
		} // end of for
		return sum;// 총합 리턴 => 값을 가지고 호출한 곳으로 간다, 해당 메소드를 빠져나간다
	}// end of method sumCall()

	public static void showInfo() {// void 리턴값 없음
		System.out.println("여기는 리턴 값이 없는 것을 연습함");
	}// end of method showInfo()

	public static void printShow(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {// 1부터 num까지 1씩 증가
			sum += i;
		} // end of for
		System.out.println("1~" + num + "까지의 합은 : " + sum);
	}// end of method printShow()

}// end of class
