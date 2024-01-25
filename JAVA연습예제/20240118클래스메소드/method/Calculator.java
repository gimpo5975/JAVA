package method;

public class Calculator {
	// 필드( =인스턴스 변수, 멤버 변수)
	int num;

	// 생성자(객체를 초기화)

	// 메소드
	public void powrOn() {
		System.out.println("전원을 켭니다!띠리리리~");
	}

	public int plus(int x, int y) {
		int result = 0;
		result = x + y;
		return result;
	}
	
	public double devide(int x, int y) {
		double result = 0.0;
		result = (double)x / y;
		return result;
	}
	
	public void powrOff() {
		num = 30;
		System.out.println(this.num + "입니다");
		System.out.println("전원을 끕니다!띠리리리....");
	}
	
	public void showInfo() {
		int testResult = plus(10, 20) + 30;
		System.out.println(testResult);
		System.out.println(devide(5, 7));
	}
	
}// end of class
