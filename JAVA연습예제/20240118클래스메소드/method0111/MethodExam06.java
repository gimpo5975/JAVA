package method;

public class MethodExam06 {

	public static void main(String[] args) {
		// 전자계산기
		// 1.전원켜기 => powerOn()
		// 2.계산 => plus(), minus(), multiple(), devision()
		// 3.전원끄기 => powerOff()

		// 메소드 호출
		int resultPlus = plus(4, 3);
		int resultMinus = minus(8, 3);
		int resultMultiple = multiple(3, 5);
		int resultDevision = devision(5, 2);

		// 메소드 호출
		poswerOn();
		
		if (resultDevision == 0) {
			System.out.println("0으로 나눌 수 없습니다!");
		} else {
			System.out.println("Devision(): " + resultDevision);
		} // end of if

		//메소드 호출
		System.out.println("Plus(): " + resultPlus);
		System.out.println("Minus(): " + resultMinus);
		System.out.println("Multiple(): " + resultMultiple);

		// 메소드 호출
		powerOff();

	}// end of main

	public static void poswerOn() {
		System.out.println("전원을 켭니다! 위위우우웅이이이이잉잉~");
	}// end of powerOn()

	public static int plus(int a, int b) {
		return a + b;
	}// end of plus()

	public static int minus(int a, int b) {
		return a - b;
	}// end of minus()

	public static int multiple(int a, int b) {
		return a * b;
	}// end of multiple()

	public static int devision(int a, int b) {
		if (b == 0) {
			return 0;
		} // end of if
		return a / b;
	}// end of devision()

	public static void powerOff() {
		System.out.println("전원을 끕니다ㅠㅠ 흐히흐이이이이잉이이...");
	}// end of powerOff()
}// end of class
