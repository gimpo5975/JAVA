package dbconnection;

public abstract class MyDBConnectionCon {// 추상 클래스 => 객체 생성을 제한 (보안성 강화)
	// 접근제한자 final static 타입 변수명 = 값;
	// 오라클 : "jdbc:oracle:thin:@loaclhost:1521:데이터베이스명";
	public final static String URL = "jdbc:mysql://localhost:3306/jdbctestdb?serverTimezone=UTC";// 데이터 베이스 연결
	public final static String USER = "root";// 아이디
	public final static String PASSWORD = "my1234";// 비밀번호

	// private MyDBConnectionCon() {}; => 생성자, 객체 생성을 제한할 때 private로 선언

}// end of class
