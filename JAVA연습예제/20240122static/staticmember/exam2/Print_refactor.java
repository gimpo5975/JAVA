package staticmember.exam2;

import java.util.Scanner;

public class Print_refactor {
	// 초기 용지: 100장 => papaerNum = 100 : static
	// 인쇄방식: 단면(true)과 양면(false) => int printMethod;
	// 양면 = 인쇄할 매수 % 2 == 0 => 인쇄매수 / 2
	// 인쇄할 매수 % 2 == 1 => 인쇄매수 /2 +1
	// 인쇄할 매수를 입력 받기 => printAmount
	// 출력형태
	// ~장 출력
	// 남은 용지매수는 ~장
	// 용지를 출력하려 할때 용지가 없는 경우, 용지가 부족한 경우, 용지가 남는 경우
	// if ~ else

	// #1. 필드_static
	static int paperNumber = 100;

	// #2. 필드_instance

	// #3. 생성자
	public Print_refactor() {
	};

	// #4. 프린트 할 메소드
	// 인쇄할 매수, 인쇄할 방식(1.단면, 2.양면)
	public void printShow(int printAmount, int printingMethod) {
		// #4_1. 양면일때 처리
		if (printingMethod == 2) {
			// 인쇄할 매수 = 넘겨 받은 인쇄할 용지 매수%2 == 0
			// 넘겨받은 인쇄할 용지 매수%2 == 1
			// 홀수쪽이면 종이 한장이 더 필요
			// 만약 3페이지 인쇄하고 싶으면 : 단면이면 3장, 양면이면 2장 필요

			// 삼항 연산자
			printAmount = (printAmount % 2 == 0) ? printAmount / 2 : printAmount / 2 + 1;
		} // end of if

		// #4_2. 인쇄 처리
		// 현재 용지가 몇장 남아있는지 확인이 필요
		// 현재 남은 용지가 없을 때, 인쇄할 용지가 현재 남은 용지보다 많을 때
		// 인쇄할 용지가 현재 남은 용지보다 작을 때
		// 여럿 중 하나의 조건에 해당하는 것만 처리
		if (paperNumber == 0) {// 현재 인쇄할 용지(기본용지)가 하나도 없을 때
			System.out.println("용지 없음");
		} else if (paperNumber < printAmount) {// 기본용지가 인새할 매수 보다 적을 때
			System.out.println("용지 부독 : " + (printAmount - paperNumber));
			// 기본 용지 만큼만 인쇄할 수 있음
			System.out.println(paperNumber + "장 인쇄");
			// 보충이 필요하기에 기본 용지를 0으로 세팅
			paperNumber = 0;
		} else {// 기본 용지가 인쇄할 매수 보다 많을 때

			System.out.println(printAmount + "장 인쇄");
			paperNumber -= printAmount;
			System.out.println("남은 인쇄 가능 매수 : " + paperNumber);
		} // end of if
	}// end of printShow()

	
	
}// end of class
