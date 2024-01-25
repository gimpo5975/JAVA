package array3;

import java.util.Scanner;

public class ArrayExam04_04_1_2 {

	public static void main(String[] args) {
		// #1. Scanner 객체 생성 - 입력받기 위해
		Scanner scan = new Scanner(System.in);

		// #2. 변수 선언 - 지역변수 {}안에서 사용
		int studentCount = 0; // 학생수
		int[] scores = null; // 배열은 한 번 크기를 설정하면 변경할 수 없다
		// null - 아직 참조하는 곳이 없다. 힙영역을 참고 있지 않다.
		boolean run = true; // while문의 진행 여부를 설정하기 위해 사용
		// 값이 true이므로 일단 반복을 진행
		// true - 반복(whie문 실행), false - 반복(while) 종료

		// #3. while문을 실행해서 학생수, 점수입력, 점수리스트, 분석등을 진행
		while (run) {
			// #3-1. 메시지가 반복이므로 메시지 부터 설정
			System.out.println("============================================================");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("============================================================");
			System.out.print("번호 선택>>");
			int selectNo = scan.nextInt();
			System.out.println();

//	         switch(selectNo) { case 1:  실행; break;...}
			if (selectNo == 1) { // 1. 학생수
				System.out.print("학생수 입력>>");
				studentCount = scan.nextInt();
				System.out.println();

			} else if (selectNo == 2) {// 2. 점수입력
				// 학생수 만큼의 배열 공간을 만들어 주기, 위에서는 null아직 연결을 안한
				// 상태이므로 여기에서 공간을 확보 필요
				scores = new int[studentCount]; // 점수를 담을 배열 생성

				// 배열 공간에 점수 입력 받고 담기-학생 수가 유동적이라 반복문을 사용
				for (int i = 0; i < scores.length; i++) {
					// 안내 문구
					System.out.print((i + 1) + "번 학생 점수 입력>>");
					scores[i] = scan.nextInt(); // 입력받은 점수 배열에 담기
				} // for문의 끝
				System.out.println();

			} else if (selectNo == 3) { // 3. 점수 리스트
				for (int i = 0; i < scores.length; i++) {
					System.out.println((i + 1) + "번 학생 점수 = " + scores[i]);
				} // for문의 끝
				System.out.println();
			} else if (selectNo == 4) {
				int sum = 0; // 합계
				double avg = 0.0; // 평균
				int max = scores[0]; // 최고 점수를 초기화
				int min = scores[0]; // 최저 점수를 초기화

				// 최댓값, 최솟값, 합계
				for (int i = 0; i < scores.length; i++) {
					// 최댓값
					if (max < scores[i]) { // max에 담긴 값이 i번째 요소보다 작으면
						max = scores[i]; // max에는 더 큰 i번째 요소 값 담기
					} // if문 끝

					// 최솟값
					if (min > scores[i]) { // min에 담긴 값이 i번째 요소보다 크면
						min = scores[i]; // min에는 더 작은 i번째 요소 값 담기
					} // if문 끝

					// 합계 - 평균을 구하기 위해서 필요
					sum += scores[i]; // 점수 누적해서 합계 구하기, sum = sum + scores[i]

				} // for문 끝

				// 평균
				// avg = (double)sum / scores.length;
				avg = (double) sum / studentCount;

				System.out.println("최고 점수 : " + max);
				System.out.println("최저 점수 : " + min);
				System.out.printf("평균 점수 : %.2f\n", avg); // 소수이하 둘째자리까지 평균 구하기
				System.out.println();
			} else if (selectNo == 5) {
				// 종료 해야 함
				run = false;
			}

		} // end of while

		System.out.println("프로그램 종료");

	}

}