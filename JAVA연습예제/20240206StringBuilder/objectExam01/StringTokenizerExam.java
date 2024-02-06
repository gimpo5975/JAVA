package objectExam01;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerExam {

	public static void main(String[] args) {

		String str01 = "java/html/python/css";

		StringTokenizer strToken = new StringTokenizer(str01, "/");// str01 문자열에 /를 기준으로 자름
		while (strToken.hasMoreTokens()) {// 꺼내올 문자열이 있으면
			String token = strToken.nextToken();
			System.out.println(token);
		} // end of while

		String str02 = "나!는!김!원!중 이 다";
		String[] arryStr = str02.split("!| "); // !와 공백을 기점으로 문자열을 잘라서 배열에 저장

		// for-each문으로 배열 출력
		for (String arr : arryStr) {
			System.out.print(arr + " ");
		} // end of for-each

		System.out.println();
		// Arrays.toString()으로 배열을 문자열로 출력
		System.out.println(Arrays.toString(arryStr));
		System.out.println();

		String str03 = "hello!! java";
		// 문자열의 일부만을 출력, 느낌표만 출력하기
		String subStr = str03.substring(5, 7);
		System.out.println(subStr);
		System.out.println();
		
		//문자열의 앞과 뒤에 있는 공백을 제거
		String str04 = "                    무야호!                         ";
		System.out.println(str04);
		String stripStr04 = str04.strip();
		System.out.println(stripStr04);
		System.out.println();
		
	}// end of main

}// end of class
