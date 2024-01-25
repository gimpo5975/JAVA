package classExam;

import java.util.Scanner;

public class WeightExam_refactor {

	public static void main(String[] args) {
		// #1. Scanner 객체와 WeightChang 객체 생성
		Scanner scan = new Scanner(System.in);
		Weight_refactor wChange = new Weight_refactor("홍길동", 170.8, 70.3);

		// #2. 변수 선언
		double weight = 0.0; // 변화된 몸무게 받을 변수

		// #3. 몸무게 입력 받기
		System.out.println("몸무게 변화를 입력해주세요");
		System.out.print("변화된 몸무게 >>");
		weight = scan.nextDouble(); // double 타입

		System.out.println();
		System.out.println("-----------------");

		// #4. 몸무게 증감을 알기 위해 메소드 호출
		wChange.weightInfo(weight);

		System.out.println();
		System.out.println("-----------------");

		// #5. 회원에 대한 정보를 알기 위해
		wChange.showMemberInfo();

	}// end of main

}// end of class
