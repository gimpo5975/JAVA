package collectionexam;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExam {

	// entry point
	public static void main(String[] args) {

		List<Board> list = new Vector<Board>(); // multi-thread
//		List<Board> list = new ArrayList<Board>();//single-thread

		// Thread for input instance to list
		Thread threadInput = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i <= 100; i++) {
					list.add(new Board("제목" + i, "내용" + i, "작성자" + i));
				} // end of for
			}// end of run
		};// end of Thread

		Thread threadInput1 = new Thread() {
			@Override
			public void run() {
				for (int i = 101; i <= 200; i++) {
					list.add(new Board("제목" + i, "내용" + i, "작성자" + i));
				} // end of for
			}// end of run
		};// end of Thread

		// Thread start
		// threadName.start();
		threadInput.start();
		threadInput1.start();

		// stop until Thread's work complete
		try {
			threadInput.join();
			threadInput1.join();
		} catch (InterruptedException e) {
			System.out.println("Execption occurred");
		} // end of try-catch

		// Print
		System.out.println("********************************************************************");
		System.out.println("총 객체 수 : " + list.size());
		System.out.println();

	}// end of main

}// end of class
