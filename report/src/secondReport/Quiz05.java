package secondReport;

//아래와 같이 출력되는 프로그램을 작성하시오.
//1    2    3    4    5
//6    7    8    9   10
//11   12   13   14   15
//16   17   18   19   20
//21   22   23   24   25
//----------------------------------------
public class Quiz05 {
	// 배열 초기화
	static int[][] arr = new int[5][5];

	// 변수 초기화
	static int count = 0;

	// entry point
	public static void main(String[] args) {
		// 2차원 배열요소가 1씩 증가하는 메소드 호출
		arrPrint();
	}// end of main

	// 2차원 배열요소가 1씩 증가하는 메소드
	public static void arrPrint() {
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[i].length; k++) {
				// 배열의 요소 1씩 증가
				count++;
				arr[i][k] += count;
				System.out.print(arr[i][k] + "\t");
			} // end of for in
			System.out.println();
		} // end of for out
	}// end of arrPrint()

}// end of class
