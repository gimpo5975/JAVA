package chap08_2_2;

public class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("MySql Db에서 검색");

	}

	@Override
	public void insert() {
		System.out.println("MySqlDb에서 삽입");

	}

	@Override
	public void update() {
		System.out.println("MySql Db에를 수정");

	}

	@Override
	public void delete() {
		System.out.println("MySql Db에서 삭제");

	}

}//end of interface
