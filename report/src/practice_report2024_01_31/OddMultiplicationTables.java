package practice2024_01_31;
//5.  구구단을 구하는 프로그램을 작성

//홀수단만 구하기(3, 5, 7, 9 단만)
// 1)  for문만 사용
// 2) for문과 if문 사용
// 3) for문과 if문, continue 활용

public class OddMultiplicationTables {

	// entry point
	public static void main(String[] args) {

		for (int i = 3; i <= 9; i++) {// 3~9까지 증가하면서 짝수일 때는 넘어간다.
			if (i % 2 == 0) {
				continue;
			} // end of if
			System.out.println(i + "단");
			for (int k = 1; k <= 9; k++) {
				System.out.printf(i + " X " + k + " = " + (i * k) + "\t");
			} // end of for in
			System.out.println();
		} // end of for

	}// end of main

}// end of class
