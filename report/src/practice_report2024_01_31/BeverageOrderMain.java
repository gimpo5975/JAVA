package practice2024_01_31;

import java.util.Scanner;

public class BeverageOrderMain {

	// entry point
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] teams = new String[10];
		String[] beverages = new String[10];

		int num = 0;
		while (num <= 10) {
			System.out.println("주문자 이름 >> ");
			teams[num] = sc.nextLine();
			System.out.println("음료 이름 >> ");
			beverages[num] = sc.nextLine();

			System.out.println("주문을 더 받으시겠습니까?");
			System.out.println("[1]예 | [2]아니오");
			int orderGoOrNot = Integer.parseInt(sc.nextLine());

			if (orderGoOrNot == 2) {

				break;
			} // end of if

			num++;
		} // end of while

		System.out.println("*** 음료 주문 현황 ***");
		for (int i = 0; i < teams.length; i++) {
			if (teams[i] == null) {
				continue;
			} // end of if
			System.out.printf("%s님 -> %s\n", teams[i], beverages[i]);
		} // end of for
		System.out.printf("총 %d명이 주문하였습니다.", (num+1));
	}// end of main

}// end of class
