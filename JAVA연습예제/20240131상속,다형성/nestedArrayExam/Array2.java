package nestedArrayExam;

public class Array2 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		int value = 1;// 초기값
		int middle = 0;// 중앙

		// 값 넣기
		for (int i = 0; i < arr.length; i++) {
			middle = arr.length / 2;

			if (i <= middle) {// i가0~3일 때
				for (int k = i; k < arr[i].length - i; k++) {// i가 1일 때 양쪽에서 1만큼, 2일 때 양쪽에서 2만큼 빼줘야한다.
					arr[i][k] = value;// 배열에 값 저장
					value++;// 값 1씩 증가
				} // end of for
			} else {// i가4~5일때
				for (int k = arr[i].length - (i + 1); k <= i; k++) {// i가 3일 때 양쪽에서 하나씩 빼줘야한다
					arr[i][k] = value;// 배열에 값 저장
					value++;// 1씩 증가
				} // end of for

			} // end of if
		} // end of for

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[i].length; k++) {
				if (arr[i][k] == 0) {// 값이 0일때는 공백으로 채운다
					System.out.printf("%2s \t ", "");
				} else {
					System.out.print(arr[i][k] + "\t");// 값이 있으면 공간을 띄워서 채운다.
				}
			} // end of for in
			System.out.println();
			System.out.println("------------------------------------");
		} // end of for

	}// end of main

}// end of class
