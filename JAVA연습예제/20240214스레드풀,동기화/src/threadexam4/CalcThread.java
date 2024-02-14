package threadexam4;

import static threadexam4.SleepShow.*;

public class CalcThread extends Thread {

	// # field
	private int sum;

	// getter / setter
	public int getSum() {
		return sum;
	}// end of getSum

	public void setSum(int sum) {
		this.sum = sum;
	}// end of setSum

	// # method
	@Override
	public void run() {

		// Sum from 1 to 100;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		} // end of for

	}// end of run

}// end of class
