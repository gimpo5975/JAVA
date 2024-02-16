package practice2024_02_15;
//8. 인접한 요소간에 동일한 값을 가지지 않도록 아래의 내용을 수정하여 출력

//int[] arry = { 5,3,3,2,7,6,6,4, 1}
//
// <출력형태 예시>
// [5, 3, 2, 7, 3, 6, 4, 6, 1]

public class NotSameNumArray {
	static int[] arry = { 5, 3, 3, 2, 7, 6, 6, 4, 1 };

	// entry point
	public static void main(String[] args) {
		showArray();
	}// end of main

	public static void notSameNum(int[] arry) {
		for (int i = 0; i < arry.length; i++) {
			for (int j = 1; j < arry.length; j++) {
				int r = (int) (Math.random() * 8) + 1;// 난수 생성
				if (arry[i] == arry[j]) {
					int k = arry[i];
					arry[j] = arry[r];
					arry[r] = k;
				} // end of if
			} // end of for in
		} // end of for
	}// end of notSameNum

	public static void showArray() {
		notSameNum(arry);
		for (int i = 0; i < arry.length; i++) {
			System.out.print(arry[i] + " ");
		} // end of for
	}// end of showArry

}// end of class
