package practice2024_01_31;

public class SumToOneHundred {
//	2. 100 ~ 1까지의 자연수의 합을 구하시오.
//	   1) for문과  
//	      for(초기값; 종료값; 최종값){ 
//	         실행문장
//	      }
//	   2) while문 두 방법 모두 구현
//	      while(조건) { 
//	         실행할 문장
//	       } 
//	     
//	   < 출력화면 >
//	   100 ~ 1 까지의 합 : 5050

	public static void main(String[] args) {
		// #1. 지역변수 초기화
		int sum = 0;// for문에 쓰이는 총합
		int num = 100;// while문에 쓰이는 기본값
		int sum2 = 0;// while문에 쓰이는 총합

		System.out.println("*** for문 ***");
		// #2. for문을 이용한 계산
		for (int i = 100; i >= 1; i--) {
			sum += i;// == sum = sum + i
		} // end of for
		System.out.println("100~1 까지의  합 : " + sum);

		System.out.println("*** while문 ***");
		// #3. while문을 이용한 계산
		while (num >= 0) {
			sum2 += num;
			num--;// 100~1까지 반복하면서 1씩 감소

		} // end of while
		System.out.println("100~1 까지의  합 : " + sum2);
	}// end of main

}// end of class
