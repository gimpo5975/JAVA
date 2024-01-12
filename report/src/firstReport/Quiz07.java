package firstReport;

public class Quiz07 {
	public static void main(String[] args) {
		/*
		 * 문7) 연필이 357자루가 있습니다. 학생이 13명 있습니다. 학생당 몇 자루 씩 나누어 주어야 할까요? 그리고 나머지는 몇 자루인가?
		 * 즉, 학생 1인당 받을 연필 개수와 나눠주고 남은 연필의 개수 구하기
		 */

		// 정수형 변수 초기화
		int pencils = 75;
		int students = 13;
		int pencilsPerStudents = 0;
		int restPencils = 0;

		pencilsPerStudents = pencils / students;
		restPencils = pencils % students;
		
		System.out.println("학생 1인당 받을 연필 개수 : " + pencilsPerStudents);
		System.out.println("남은 연필 개수 : " + restPencils);

	}// end of main
}// end of class
