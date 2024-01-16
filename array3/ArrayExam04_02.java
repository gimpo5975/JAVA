package array3;

public class ArrayExam04_02 {

	public static void main(String[] args) {
		int[][] num = new int[5][5];// 5행5열 정수형 배열 초기화
		int count = 1;
		for (int i = 0; i < num.length; i++) {// 행을 반복
			for (int k = 0; k < num[i].length; k++) {// 한행에서의 열을 반복
				num[i][k] = count;// num[0][0] = 1 부터시작
				System.out.print(num[i][k] + "\t");
				count++;// 1씩 증가
			} // end of for in
			System.out.println();
		} // end of for out
	}// end of main

}// end of class
