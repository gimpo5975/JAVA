package practice2024_02_15;
//7. 1 ~ 10사이의 난수를 발생하여 배열 공간에 저장한 후 출력하기

import java.util.Scanner;

//요소의 개수는 키보드로 부터 입력 받기
//
//<입력 형태>
//난수를 저장할 공간의 개수 입력>> 5
//
//<출력형태>
//arry[0] : ~~
//arry[1] : ~~
//arry[2] : ~~
//arry[3] : ~~
//arry[4] : ~~

public class RandomNumPrint {
	private static Scanner sc = new Scanner(System.in); // 입력 받기 위한 객체 생성

	// entry point
	public static void main(String[] args) {
		arrayPrint();//원하는 만큼 난수 생성해서 출력하기
	}// end of main

	// 요소의 개소를 입력받아 배열을 생성하고 그 배열을 넘겨주는 메소드
	public static int[] createArray() {
		System.out.print("난수를 저장할 공간의 개수 입력 >> ");
		int[] arr = new int[sc.nextInt()];// 공간의 개수 입력받아서 배열의 크기로 지정해서 배열 생성
		return arr;// 생성한 배열을 넘겨 줌
	}// end of createArray

	// 배열을 받아서 난수 생성해서 배열에 값 넣고 넘겨주기
	public static int[] inputArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] += (int) (Math.random() * 10) + 1;//난수 생성해서 배열에 저장
		} // end of for

		return arr;
	}// end of inputArray

	// 값을 넣은 배열을 입력받아서 출력하기
	public static void arrayPrint() {
		int[] array = createArray();//생성한 배열 저장
		int[] arr = inputArray(array);//값을 넣은 배열 저장
		for (int i = 0; i < arr.length; i++) {//값을 넣은 배열 출력 
			System.out.println("array[" + i + "] : " + arr[i]);
		} // end of for
	}// end of arrayPrint

}// end of class
