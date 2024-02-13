package threadExam03;

public class HelloJavaMainThread {

	public static void main(String[] args) {
		System.out.println("hi~I'm MainThread");
		System.out.println();

		Thread helloThread = new HelloThread();
		helloThread.start();

		Thread javaThread = new JavaThread();
		javaThread.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}

		System.out.println();
		System.out.println("Bye~ MainThread");

	}

}
