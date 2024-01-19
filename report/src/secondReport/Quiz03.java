package secondReport;

//0~9까지의 숫자를 임으로 출력하는 프로그램 작성하시오.
public class Quiz03 {

	static int num = (int) (Math.random() * 10);

	// entry point
	public static void main(String[] args) {
		numPirnt();

	}// end of main

	// 임의의 자연수 출력하는 메소드
	public static void numPirnt() {
		System.out.println("임의의 자연수 : " + num);
	}// end of numPirnt()

}// end of class
