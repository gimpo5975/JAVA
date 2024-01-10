package exam.bookExam;

public class BookExam4_3 {
	public static void main(String[] args) {
		//시작과 끝이 명확할 때는 for문이 좋다
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				int rs = 4 * x + 5 * y;
				if (rs == 60) {
					System.out.printf("(%d,%d)\n", x, y);
				} // end of if
			} // end of for in
		} // end of for out
	}// end of main
}// end of class
