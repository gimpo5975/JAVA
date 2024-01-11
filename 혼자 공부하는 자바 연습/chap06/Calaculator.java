package honggongja.sec06;

public class Calaculator {

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}// end of plus

	double avg(int x, int y) {
		double sum = plus(x, y);
		double avg = sum / 2;
		return avg;
	}// end of avg

	void execut() {
		double result = avg(7,10);
		println("실행결과: " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
	
}// end of class
