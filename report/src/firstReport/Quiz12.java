package firstReport;

public class Quiz12 {

	public static void main(String[] args) {
		/*
		 * 문12) 김자바는 자바 55점, 소프트웨어 30점을 받았습니다. 이번 학기에 두 과목 중 적어도 한 과목이 70점 이상이면 "통과" 그렇지
		 * 않으면 "재수강"으로 처리하려고 합니다. 김자바의결과를 출력하는 프로그램을 작성하세요.
		 */

		int java = 55, soft = 30;// 정수형 변수 초기화
		if (java >= 70 || soft >= 70) {
			System.out.println("통과");
		} else {
			System.out.println("재수강");
		} // end of if

	}// end of main

}// end of class
