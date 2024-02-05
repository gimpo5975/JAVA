package exceptionexam;

public class ExceptionEXam02 {

	// entry point
	public static void main(String[] args) {

		int a = 5;
		int b = 0;

		try {// 예외가 발생할 수있는 구문을 작성
			System.out.println(a / b);
		} catch (Exception e) {// 예외 발생시 처리할 구문
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage());// 메시지 출력
			e.printStackTrace();// 예외가 발생한 모든 경로를 알려줌
			// 개발전 캐스팅이나 예외원인을 알기 위해 사용
			// 개발이 끝나면 반드시 지우거나 주석처리
		} // end of try/catch

		System.out.println("안녕하세용");

	}// end of main

}// end of class
