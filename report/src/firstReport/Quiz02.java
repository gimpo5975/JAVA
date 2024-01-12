package firstReport;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		/*
		 * 문2) 공연시간과 공연시간을 분으로 처리해서 출력하는 프로그램 작성 < 요구사항 > - 홍길동은 '시스터액터'라는 뮤지컬 공연을 보았다.
		 * 뮤지컬 총 시간은 2시간 30분이었다. - 관람일은 2024-1-2일 이다. - 뮤지컬 이름, 관람자, 관람일, 공연시간, 시간, 분을
		 * 변수로 선언하고 아래와 같이 출력하시오.
		 */

		Scanner sc = new Scanner(System.in);// Scanner 객체 생성

		String musicalName = "", watcher = "", year = "", month = "", day = "", hour = "", minute = "";// 문자열 참조변수 초기화

		System.out.printf("관람자 성함을 입력하세요 : ");// 안내문구
		watcher = sc.next();// 관람자 입력


		System.out.println("관람년도와 관람월 관람일짜를 입력하세요 : ");
		year = sc.next();// 관람년도 입력
		month = sc.next();// 관람월 입력
		day = sc.next();// 관람일 입력
		
		System.out.println("관람시간 관람분을 입력하세요 : ");
		hour = sc.next();// 관람시간 입력
		minute = sc.next();// 관람분 입력
		
		System.out.println();
		System.out.println("** 시스터 액터 뮤지컬 관람 정보 **");
		System.out.println("공연 관람자 : " + watcher);
		System.out.printf("공연관람일 :\t %s-%s-%s\n",year,month,day);
		System.out.printf("공연시간 :\t %s시간 %s분",hour,minute);
		
	}// end of main

}// end of class
