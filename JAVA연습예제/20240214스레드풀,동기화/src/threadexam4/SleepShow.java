package threadexam4;

public class SleepShow {

	public static void sleepShow(long num) {

		try {
			Thread.sleep(num);
		} catch (InterruptedException e) {
			System.out.println("exception occurred");
		} // end of try-catch

	}// end of sleepShow

}// end of class
