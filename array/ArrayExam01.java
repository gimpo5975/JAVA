package array;

public class ArrayExam01 {

	public static void main(String[] args) {

		// 배열로 공간생성 new연산자는 힙영역에 배열객체 생성
		//배열 공간 확보 => 0, 0, 0
		int[] kor = new int[3];//힙영역에 정수형을 담을 수 있는 공간을 3개 확보하고 kor변수에 그 주소를 알려주기
		//힙에는 비어있는 변수나 객체를 만들 수 없다. 
		//JVM은 공간을 만들고 값이 없으면 기본 값으로 초기화를 시켜준다.
		//int -> 0, long -> 0L, -> double -> 0.0, float -> 0.0f
		//boolean -> false
		//참조형(String, ...) -> null로 초기화를 시켜 준다
		//but 기본변수는 초기화 시키지 않는다.
		//배열 공간에 값을 담기
		kor[0] = 95;
		kor[1] = 85;
		kor[2] = 75;
		
		//출력문
		System.out.println("kor[0]: " + kor[0]);
		System.out.println("kor[1]: " + kor[1]);
		System.out.println("kor[2]: " + kor[2]);
		System.out.println();//줄 한칸 띄우기

		// for문으로 코드 간결화
		for (int i = 0; i < kor.length; i++) {
			System.out.println("kor[" + i + "]: " + kor[i]);
		} // end of for

	}// end of main

}// end of class
