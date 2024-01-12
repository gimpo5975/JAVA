package firstReport;

import java.util.Scanner;

public class Quiz32 {

	public static void main(String[] args) {
		/*
		 * 문32) 수량을 입력 받아 수량에 가격 4500을 곱한 금액을 계산하고 영수증이 필요한지 물어서 '영수증'을 선택하면 '금액 ~~입니다'
		 * '영수증 여기 있습니다' 출력하고 영수증을 원하지 않으면 '금액은 ~~ 입니다.' '영수증 없습니다.'를 출력하는 프로그램
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("수량을 입력해주세요");
		int num = Integer.parseInt(sc.nextLine());
		
		int pirce = num * 4500;
		
		System.out.println("영수증이 필요하신가요? [1]예  [2]아니오");
		String select = sc.nextLine();
		String bill = "";
		if(select.equals("1")) {
			bill ="영수증 여기 있습니다";
		}else if(select.equals("2")) {
			bill="영수증은 없습니다";
		}else {
			System.out.println("잘못된 선택입니다");
		}//end of if
		
		System.out.println("금액은 "+pirce+"입니다.\n" + bill);
	}//end of main

}
