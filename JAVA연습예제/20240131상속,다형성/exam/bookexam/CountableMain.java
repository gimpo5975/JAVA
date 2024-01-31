package exam.bookexam;

public class CountableMain {

	// entry point
	public static void main(String[] args) {

		Countable[] ct = { new Bird("뻐꾸기"), new Bird("독수리"), new Tree("사과나무"), new Tree("밤나무") };

		for (Countable ctArr : ct) {
			ctArr.count();

			if (ctArr instanceof Bird bird) {
				bird.fly();
			} else if (ctArr instanceof Tree tree) {
				tree.ripen();
			} // end of if
			System.out.println();
		} // end of for-each

	}// end of main

}// end of class
