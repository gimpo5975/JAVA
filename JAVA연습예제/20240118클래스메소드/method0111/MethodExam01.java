package method;

public class MethodExam01 {

	public static void main(String[] args) {
		int sum = 0;// 총합 초기화

		// #1. 1~5까지의 합
		for (int i = 1; i <= 5; i++) {// i는 1부터 5까지 1씩 증가
			sum += i;// sum = sum + i
		}
		System.out.println("1~5까지의 합: " + sum);

		sum = 0;// 변수는 가장 마지막에 저장된 하나의 값만 저장
		// #1~10까지의 합
		for (int i = 1; i <= 10; i++) {// i는 1부터 10까지 1씩 증가
			sum += i;// sum = sum + i
		}
		System.out.println("1~10까지의 합: " + sum);

		sum = 0;
		// #50~100까지의 합
		for (int i = 50; i <= 100; i++) {// i는 50부터 100까지 1씩 증가
			sum += i;// sum = sum + i
		}
		System.out.println("50~100까지의 합: " + sum);

		sum = 0;
		// #35~75까지의 합
		for (int i = 35; i <= 75; i++) {// i는 35부터 75까지 1씩 증가
			sum += i;// sum = sum + i
		}
		System.out.println("35~75까지의 합: " + sum);

	}//end of main

}//end of class
