package practice2024_02_15;

import java.util.ArrayList;
import java.util.Scanner;

//6. 배열에서 특정 값을 가지는 요소를 찾아서 출력하시오.

//만일 같은 값을 가진 요소가 여러 개 있으면 가장 앞에 위치한 요소의 값을 찾아 출력하는 프로그램 작성
//
// <입력형태>
// 입력할 자료의 수를 입력 >> 5
//
// find[0] = 15
// find[1] = 30
// find[2] = 27
// find[3] = 65
// find[4] = 30
//
// <출력 형태>
// 찾는 값 : 30
// 30은 find[1]에 있습니다.

public class FindIndexOf {
	static Scanner sc = new Scanner(System.in);// 입력 받기 위한 스캐너 객체 생성
	static int numberOfElements;

	// entry point
	public static void main(String[] args) {
		findIndex();
	}// end of main

	// ArrayList로 list 배열을 생성하는 메소드
	public static ArrayList<Integer> createList() {
		System.out.println("입력할 자료의 수를 입력하세요.");
		System.out.print("수 입력 >> ");
		numberOfElements = Integer.parseInt(sc.nextLine());// 배열의 크기

		ArrayList<Integer> list = new ArrayList<Integer>(numberOfElements);// 배열의 크기만큼 배열 생성
		return list;
	}// end of inputList

	// 자료를 입력하는 메소드
	public static ArrayList<Integer> inputList(ArrayList<Integer> list) {
		for (int i = 0; i < numberOfElements; i++) {
			System.out.print("list[" + i + "] = ");
			list.add(Integer.parseInt(sc.nextLine()));
			System.out.println();
		} // end of for

		return list;
	}// end of inputList

	// 값을 찾아 출력하는 메소드
	public static void findIndex() {
		ArrayList<Integer> list = createList();// 배열의 크기 생성해서 받기
		ArrayList<Integer> findList = inputList(list);// 값을 넣은 배열 받기

		System.out.print("찾을 값 입력 >> ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println();

		// Test
		int findIndex = findList.indexOf(num);// 앞에서 부터 30이 있으면 그 인덱스 저장
		int findNum = findList.get(findIndex);// 30의 인덱스로 30 저장
		System.out.println("찾는 값 : " + findNum);// 30의 인덱스로 30 출력
		System.out.println(findNum + "은 find[" + findIndex + "]에 있습니다.");

	}// end of findIndex

}// end of class
