package staticmember.exam2;

import java.util.Scanner;

public class PrintExam_refactor {

	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      Print print = new Print();
	      
	      System.out.println("인쇄 방식을 선택");
	      System.out.println("1. 단면 | 2. 양면");
	      System.out.print("선택>>");
	      int printingMethod = Integer.parseInt(scan.nextLine());
	      System.out.println();
	      
	      System.out.print("인쇄 매수 입력>>");
	      int printAmount = Integer.parseInt(scan.nextLine());
	      
	      print.printShow(printAmount, printingMethod);

	   }//end of main

	}//end of class