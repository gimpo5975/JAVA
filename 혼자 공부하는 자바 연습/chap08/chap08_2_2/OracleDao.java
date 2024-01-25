package chap08_2_2;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Oracle Db에서 검색");

	}

	@Override
	public void insert() {
		System.out.println("Oracle Db에서 삽입");

	}

	@Override
	public void update() {
		System.out.println("Oracle Db에를 수정");

	}

	@Override
	public void delete() {
		System.out.println("Oracle Db에서 삭제");

	}

}//end of interface
