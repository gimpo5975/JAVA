package practice2024_01_31;
//4.  1 ~ 10까지 자연수를 이용하여 아래와 같이 출력하는 프로그램 작성

//시작값 : 1,   최종값 : 10
//( for문, while문, do ~ while문 구현) 
//     
//출력형태) 
//10  9  8  7  6  5  4  3  2  1

public class NumberReversePrint {
	
	//entry point
	public static void main(String[] args) {

		for(int i=10;i>=1;i--) {
			System.out.print(i+"\t");
		}
		
	}//end of main

}//end of class
