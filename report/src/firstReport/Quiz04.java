package firstReport;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		/*
		 * 문4) 정보화 성적을 출력하기 중앙정보에서 지난 12월 사원들 정보능력을 평가하였다. 평가 과목은 엑셀, 자바, 파이썬 3개의 과목이었다.
		 * 김중앙은 엑셀 76점, 자바 98점, 파이썬 50점을 받았다. 김중앙의 정보화 성적표를 아래와 같은 형식으로 출력하시오. 단, 엑셀,
		 * 자바, 파이썬, 총점은 정수로 처리하고 평균은 실수(double)으로 처리하시오. (덧셈: +, 뺄셈 : -, 곱셈 : *, 나눗셈 : /
		 * ) 총점은 엑셀, 자바, 파이썬 성적을 모두 더한 값 평균은 엑셀, 자바, 파이썬 3과목의 점수를 평균한 값
		 */

		Scanner sc = new Scanner(System.in);// Scanner 객체 생성

		String name = ""; // 문자열 참조변수 초기화
		int excel = 0, java = 0, python = 0, sum = 0; // 정수형 변수 초기화
		double avg = 0.0; // 실수형 변수 초기화

		System.out.print("이름을 입력하세요 : ");// 안내 문구
		name = sc.next();// 이름 입력받기

		System.out.print("excel 점수를 입력하세요 : ");// 안내 문구
		excel = sc.nextInt();// excel점수 입력받기

		System.out.print("java 점수를 입력하세요 : ");// 안내 문구
		java = sc.nextInt();// java점수 입력받기

		System.out.print("python 점수를 입력하세요 : ");// 안내 문구
		python = sc.nextInt();// python점수 입력받기

		sum = excel + java + python; // 총점 저장
		avg = sum / 3.0;// 평균 저장

		System.out.println("**" + name + "의 중간고사 성적 **");
		System.out.println("===============================================");
		System.out.printf("이름\t엑셀\t자바\t파이썬\t합계\t평균\n");
		System.out.println("===============================================");
		System.out.printf("%s\t%1d\t%2d\t%3d\t%4d\t%.2f\n", name, excel, java, python, sum, avg);
		System.out.println("===============================================");
		
	}// end of main

}// end of class
