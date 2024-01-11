package honggongja.sec06;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalculator = new Calculator();
		
		myCalculator.powerOn();
		
		int result1 = myCalculator.plus(10, 100);
		System.out.println("result1 : " + result1);
		
		double result2 = myCalculator.devide(10, 100);
		System.out.println("result2 : " + result2);
		
		myCalculator.powerOff();
	}

}
