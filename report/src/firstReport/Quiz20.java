package firstReport;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		/*
		 * 문20) 길동이는 사과와 배의 주문 개수를 입력받았습니다. 그런데 순서를 착각하여 배의 주문 개수를 사과의 주문개수로 입력하였고, 사과의
		 * 주문개수를 배의 주문개수로 입력하였습니다. 잘못 입력한 주문 개수를 수정하는 프로그램 작성
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("사과 주문수량 입력: ");
		int apple = Integer.parseInt(sc.nextLine());
		System.out.print("배 주문수량 입력: ");
		int pear = Integer.parseInt(sc.nextLine());

		System.out.println("수령전 주문 개수");
		System.out.println("사과: " + apple + "개, 배: " + pear+"개");
		
		int temp = 0;
		
		temp = apple;
		apple = pear;
		pear = temp;
		
		System.out.println("수령후 주문 개수");
		System.out.println("사과: " + apple + "개, 배: " + pear+"개");
		
	}//end of main

}
