package array;

public class ArrayExam04 {

	public static void main(String[] args) {

		// 배열로 공간생성 new연산자는 힙영역에 배열객체 생성
		// 배열 공간 확보 => 0, 0, 0
		int[] kor = new int[10];// 힙영역에 정수형을 담을 수 있는 공간을 3개 확보하고 kor변수에 그 주소를 알려주기

		// for문으로 배열 공간에 값을 담기
		//배열.length => 배열공간의 길이
		for (int i = 0; i < kor.length; i++) {
			kor[i] = (i + 1) * 10;
		} // end of for

		// for문으로 코드 간결화 출력
		for (int i = 0; i < kor.length; i++) {
			System.out.println("kor[" + i + "]: " + kor[i]);
		} // end of for

	}// end of main

}// end of class
