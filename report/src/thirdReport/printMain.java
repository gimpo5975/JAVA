package thirdReport;

import java.util.Scanner;

//1. Print클래스, PrintMain클래스를 이용하여 아래와 같이 처리

//< 요구사항>
//    1) 초기 용지 : 100장 , paperNumber = 100
//    2) 인쇄방식 : 단면(true)과 양면(false) : int printingMethod
//                양면  :  인쇄할매수 % 2 == 0 --- 인쇄매수 / 2
//                        인쇄할매수 % 2 == 1  --- 인쇄매수 /2 + 1
//     3) 인쇄할 매수를 입력 받기 : printAmount 
// 
//< 출력형태>
//      ~장 출력
//      남은 용지매수 : ~장
//    
//     용지를 출력하려 할때 용지가 없는 경우, 용지가 부족, 용지가 남는 경우
//     if ~ else if ~ else

public class printMain {

	public static void main(String[] args) {
		// 인쇄실행
		Print p = new Print();
		p.print();

	}// end of main
}// end of class

class Print {

	// #1. 필드
	// 입력을 받기 위한 Scanner 객체 생성
	static Scanner sc = new Scanner(System.in);
	static int paperNumber = 100; // 초기 용지
	int printAmount;
	int printingMethod;
	int notEnoughPaper;

	// #2. 메소드
	public void print() {
		selectPrintMethod();
		selecePrint();
		goPrint(printingMethod, printAmount);
	}// end of print()

	// 인쇄 방식을 선택하는 메소드
	public void selectPrintMethod() {
		System.out.print("인쇄할 방식을 선택하세요 >> ");
		System.out.println("[1]단면\t[2]양면");
		printingMethod = Integer.parseInt(sc.nextLine());
	}// end of selectMethod()

	// 인쇄할 매수를 입력하는 메소드
	public void selecePrint() {
		System.out.print("인쇄할 매수를 입력하세요 >>");
		printAmount = Integer.parseInt(sc.nextLine());
	}// end of selecePrint()

	// 인쇄가 진행되는 메소드 매개변수로 인쇄방식과, 인쇄할 매수 받음
	public void goPrint(int printingmethod, int printAmount) {
		notEnoughPaper = printAmount - paperNumber;
		if (printAmount > paperNumber) {// 인쇄용지가 부족한 경우
			System.out.println("용지가" + notEnoughPaper + "장 부족합니다. 충전해주세요");
			return;
		} // end of if

		if (printingmethod == 2) {// 양면인쇄일 경우
			if (printAmount % 2 == 0) {// 양면인쇄가 짝수일경우
				this.printAmount = printAmount / 2;// 인쇄에 쓰이는 용지 = 인쇄할 매수 / 2
				lastPrint();// 남은용지 출력
			} else {// 양면인쇄가 홀수일경우
				this.printAmount = (printAmount / 2) + 1;// 인쇄에 쓰이는 용지 = (인쇄할매수 /2) +1
				lastPrint();// 남은용지 출력
			} // end of if in
		} else if (printingmethod == 1) {// 단면 인쇄일 경우
			lastPrint();// 남은용지 출력
		} else {
			System.out.println("번호를 다시 선택해주세요");
		} // end of if out
	}// end of goPrint

	// 남은 용지 출력하는 메소드
	public void lastPrint() {
		System.out.println(printAmount + "장 인쇄");// 인쇄에 쓰이는 용지 출력
		paperNumber -= printAmount;// 남은 용지 계산.
		System.out.println(paperNumber + "장 남았습니다.");// 남은 용지수 출력
	}// end of lastPrint()

}// end of class Print