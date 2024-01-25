package chap08_2_2;

public class DaoExam {

	// 인터페이스타입 변수를 매개변수로하는 메소드 작성
	// 자동타입변환 발생
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}// end of dbWork

	// 메소드에 매개변수로 구현객체 대입
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}// end of main

}// end of class
