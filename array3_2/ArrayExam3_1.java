package array3_2;

public class ArrayExam3_1 {
	// entry point
	public static void main(String[] args) {
		int a = 3;
		int b = 5;

		add(a, b);
		int result = addResult(a, b);
		System.out.println(result);

		int[] num = new int[] { 10, 20, 30 };
		arrayShow1(new int[] { 50, 70, 80 });

		arrayShow2(num);

	}// end of main

	public static void arrayShow1(int[] num1) {
		for (int i = 0; i < num1.length; i++) {
			System.out.println("num[" + i + "] = " + num1[i]);
		}
	}// end of arrayShow1()

	public static void arrayShow2(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.println("num[" + i + "] = " + num[i]);
		}

	}// end of arrayShow2()

	public static void add(int a, int b) {
		a += 3;
		b += 7;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}// end of add()

	public static int addResult(int a, int b) {
		a += 3;
		b += 7;
		return a + b;
	}// end of addResult

}// end of class
