package honggongja.sec07.exam03;

public class ComputerExam {

	public static void main(String[] args) {
		int r = 7;
		Calculator cl = new Calculator();
		System.out.println("원면적 : " + cl.areaCircle(r));
		System.out.println();
		
		Computer cpu = new Computer();
		System.out.println("원면적 : " + cpu.areaCircle(r));

	}//end of main

}//end of class
