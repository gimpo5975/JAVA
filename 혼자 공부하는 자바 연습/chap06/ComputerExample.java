package honggongja.sec06;

public class ComputerExample {

	public static void main(String[] args) {

		Computer computer = new Computer();//객체 생성
		
		int[] values = {1, 2, 3};//정수타입 배열 초기화
		int result1 = computer.sum1(values);//sum1 메소드 호출
		System.out.println(result1);
		
		int result2 = computer.sum1(new int[] {1,2,3,4,5});
		System.out.println(result2);
		
		int result3 = computer.sum2(1,2,3);
		System.out.println(result3);
		
		int result4 = computer.sum2(1,2,3,4,5);
		System.out.println(result4);
		
	}

}
