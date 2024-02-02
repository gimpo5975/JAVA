package interfaceExam.Quiz01;

public class CountableMain {

	// entry point
	public static void main(String[] args) {

		Countable[] ca = { new Bird("물총새", 5), new Bird("딱따구리", 3), new Tree("무화과", 3), new Tree("포도", 100) };

		for (Countable ct : ca) {
			ct.count();

			if (ct instanceof Bird bird) {
				bird.fly();
				System.out.println("〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰〰️〰️〰️〰️");
			} else if (ct instanceof Tree tree) {
				tree.ripen();
				System.out.println("〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰️〰〰️〰️〰️〰️");
			} // end of if
		} // end of for-each

	}// end of main

}// end of class
