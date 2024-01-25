package classExam;

import java.util.Scanner;

public class Weight {

	// #1. 필드
	// #1_1 private 필드 선언
	private String name;
	private double height;
	private double beforeWeight;
	private double afterWeight;// 입력받은 몸무게를 넣을 필드
	private Scanner sc = new Scanner(System.in);// 입력받기 위한 Scanner객체 생성

	// #2. 생성자
	Weight(String name, double beforeWeight, double height) {// 생성자로 이름, 몸무게, 키 받기
		this.name = name;
		this.height = height;
		this.beforeWeight = beforeWeight;
	}// end of Weight()

	// #3. 메소드
	public void weightChange() {
		System.out.print("현재 몸무게를 입력하세요 >> ");
		afterWeight = Double.parseDouble(sc.nextLine());// 현재 몸무게 저장
		if (afterWeight > beforeWeight) {// 체중이 증가한 경우
			System.out.println("몸무게가 증가했습니다. 현재 " + afterWeight + "kg입니다");
		} else if (afterWeight < beforeWeight) {// 체중이 감소한 경우
			System.out.println("몸무게가 감소했습니다. 현재 " + afterWeight + "kg입니다");
		} else {
			System.out.println("몸무게 변화 없음 " + afterWeight);
		} // end of if
	}// end of weightChange()

}// end of class
