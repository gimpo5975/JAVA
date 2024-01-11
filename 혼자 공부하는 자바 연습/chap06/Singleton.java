package honggongja.sec06;

public class Singleton {
	//싱글톤
	
	//정적 필드
	//			   클래스		 signleton		  클래스
	private static Singleton singleton = new Singleton();
	
	//생성자
	private Singleton() {}
	
	//정적 메소드
	 static Singleton getInstance() {
		 return singleton;
	 }//end of getInstance()
	
}//end of class
	
