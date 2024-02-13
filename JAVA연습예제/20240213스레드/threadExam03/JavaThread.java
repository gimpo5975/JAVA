package threadExam03;

public class JavaThread extends Thread {

	@Override
	public void run() {

		String[] java = { "java", "python", "c", "sql", "c++" };

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
		for (int i = 0; i < java.length; i++) {
			System.out.println(java[i] + "\t");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		} // end of for

	}// end of run

}// end of class
