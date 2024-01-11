package honggongja.sec06;

public class SingletonExample {

	public static void main(String[] args) {
		// 싱글톤 객체

		// 싱글톤 객체 생성
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		// 동일 객체 참조여부 확인
		if (obj1 == obj2) { // 참조하는 번지가 같다
			System.out.println("같은 Singleton 객체입니다");
		} else {
			System.out.println("다른 Singleton 객체입니다");
		}

	}// end of main

}// end of class
