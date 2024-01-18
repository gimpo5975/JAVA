package method;

public class MethodExam05 {

	public static void main(String[] args) {
		int result = add(3, 5), result1 = add(2, 4, 7);
		double result2 = multDouble(1.5, 2.7), result3 = add(5, 2.6);
		System.out.println("(" + result + "," + result1 + "," + result2 + ", " + result3 + ")");

	}// end of main

	public static int add(int x, int y) {// 두 정수의 합을 구하는 메소드
		int rs = x + y;
		return rs;
	}// end of add

	public static int add(int x, int y, int z) {// 세 정수의 합을 구하는 메소드
		int rs = x + y + z;
		return rs;
	}// end of add2

	public static double multDouble(double x, double y) {// 두 실수의 합을 구하는 메소드
		double rs = x * y;
		return rs;
	}// end of multDouble

	public static double add(int x, double y) {// 하나의 정수와 하나의 실수의 합을 구하는 메소드
		double rs = x + y;
		return rs;
	}// end of add3

}// end of class
