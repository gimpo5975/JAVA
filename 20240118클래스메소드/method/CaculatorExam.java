package method;

public class CaculatorExam {

	public static void main(String[] args) {
		Calculator cl = new Calculator();
		
		int result1 = cl.plus(1, 2);
		double result2 = cl.devide(1, 2);
		
		cl.powrOn();
		System.out.println(result1);
		System.out.println(result2);
		cl.powrOff();
		
		cl.showInfo();
		
	}//end of main

}//end of class
