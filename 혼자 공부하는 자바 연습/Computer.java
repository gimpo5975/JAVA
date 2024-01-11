package honggongja.sec06;

public class Computer {

	int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		} // end of for
		return sum;
	}// end of sum1

	int sum2(int... values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		} // end of for
		return sum;
	}// end of sum2

}// end of class
