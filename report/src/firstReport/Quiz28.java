package firstReport;

import java.util.Scanner;

public class Quiz28 {

	public static void main(String[] args) {
		/*
		 * 문28) 여행하고 싶은 것을 입력받아 선택이 '산'이면 여행 추천지는 '한라산' 선택이 '바다'이면 여행 추천지는 '동해'로 처리하시오
		 */

		Scanner sc = new Scanner(System.in);// Scanner 객체 생성
		
		System.out.println("희망 여행지를 선택하세여 [1]산  [2]바다");
		String travle = sc.nextLine();
		String result = "", travelPlace="";
		
		if(travle.equals("1")) {
			travelPlace="산";
			result = "한라산";
		}else if(travle.equals("2")){
			travelPlace="바다";
				result="동해";
		}//end of if
		
		System.out.println("당신이 선택한 여행지는 "+travelPlace+"입니다.");
		System.out.println("추천 여행지는 "+result+"입니다.");
		
	}//end of main

}//end of class
