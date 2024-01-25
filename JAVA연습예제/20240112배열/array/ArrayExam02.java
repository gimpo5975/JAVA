package array;

import java.util.Arrays;

public class ArrayExam02 {

	public static void main(String[] args) {
		//배열 선언 방법#1
		// 0, 0, 0으로 초기화
		int[] kor = new int[3];
		kor[0] = 80;
		kor[1] = 99;
		kor[2] = 50;
		for (int i = 0; i < kor.length; i++) {//kor배열의 수 보다 작을때까지 i 1씩 증가
			System.out.println("kor[" + i + "]: " + kor[i]);
		}//end of for
		System.out.println();//줄 한칸 띄우기
		
		//배열 선언 방법#2
		// 1.배열을 선언
		// 80, 99, 50으로 초기화
		int[] kor2 = new int[] { 80, 99, 50 };
		//출력 방식1
		for (int i = 0; i < kor2.length; i++) {//kor배열의 수 보다 작을때까지 i 1씩 증가
			System.out.println("kor[" + i + "]: " + kor2[i]);
		}//end of for

		//출력방식 2
		System.out.println();
		//Arrays.toString(배열의 참조변수) => 확인만 필요할 때
		System.out.println(Arrays.toString(kor2));//Arrays.toString: 문자열로 출력해주는 메소드
	}// end of main

}// end of class
