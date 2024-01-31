package thirdReport;

import java.util.Scanner;

public class WeightChangeMain {

	public static void main(String[] args) {
		// 입력을 받기 위한 Scanner객체 생성
		Scanner sc = new Scanner(System.in);

		// 객체 생성
		WeightChange qwc = new WeightChange("김원중", 169.8, 70.1);

		// 몸무게가 변화한 만큼 입력받기
		System.out.print("변화된 몸무게를 입력하세요 >>");
		double changedWeight = sc.nextDouble();

		// 입력받은 변화한 몸구게를 매개변수로 메소드 실행
		qwc.weightInfo(changedWeight);

	}// end of ,main

}// end of class
