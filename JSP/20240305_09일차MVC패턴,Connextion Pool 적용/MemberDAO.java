package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

//db에 연결하고 select, insert, update, delete 작업을 실행해주는 클래스입니당.
public class MemberDAO {

	// 데이터베이스에 접속하는 소스를 작성
//	public final static String URL = "jdbc:mysql://localhost:3306/practice?serverTimezone=UTC";// shopdb 데이터베이스 연결
//	public final static String USER = "root";// 아이디
//	public final static String PASSWORD = "my1234";// 비밀번호

	Connection con; // 데이터베스에 접근할 수 있도록 설정
	PreparedStatement pstmt; // 데이터베이스에서 쿼리를 실행시켜 주는 객체
	ResultSet rs; // 데이터베이스의 테이블의 결과를 리턴받아 자바에 저장해 주는 객체

	// 데이터 베이스에 접근할 수 있도록 도와주는 메소드
	public void getConnection() {

		// 커넥션풀을 이용하여 데이터 베이스에 접근
		try {
			// 외부에서 데이터를 읽어 들여야 하기에
			Context initctx = new InitialContext();
			// 톰캣 서버에 정보를 담아놓은 곳으로 이동
			Context envctx = (Context) initctx.lookup("java:comp/env");
			// 데이터 소스 객체를 선언
			DataSource ds = (DataSource) envctx.lookup("jdbc/pool");
			// 데이터 소스를 기준으로 커넥션을 연결
			con = ds.getConnection();

		} catch (Exception e) {
			e.printStackTrace();
		} // end of try-catch

//		try {
//			// 1. 해당 데이터 베이스를 사용한다고 선언.(mysql connector 안에있는 driver 클래스를 등록)
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			// 2. 해당 데이터 베이스에 접속
//			con = DriverManager.getConnection(URL, USER, PASSWORD);
//		} catch (Exception e) {
//
//		} // end of try-catch
	}// end of getConnection

	// 데이터 베이스에 한사람의 회원 정보를 저장해주는 메소드
	public void insertMember(MemberBean mbean) {
		try {
			getConnection();
			// 3. 접속후 쿼리준비
			String sql = "insert into member values(?, ?, ?, ?, ?, ?, ?, ?,?)";
			// 4.쿼리를 사용하도록 설정
			pstmt = con.prepareStatement(sql);// jsp에서 쿼리를 사용하도록 설정
			// ?에 맞게 데이터를 맵핑
			pstmt.setString(1, mbean.getId());
			pstmt.setString(2, mbean.getPass1());
			pstmt.setString(3, mbean.getPass2());
			pstmt.setString(4, mbean.getEmail());
			pstmt.setString(5, mbean.getTel());
			pstmt.setString(6, mbean.getHobby());
			pstmt.setString(7, mbean.getJob());
			pstmt.setString(8, mbean.getAge());
			pstmt.setString(9, mbean.getInfo());

			// 4. mysql에서 쿼리를 실행하시오
			pstmt.executeUpdate();

			// 5.자원 반납
			con.close();
		} catch (Exception e) {
		} // end of try-catch
	}// end of insertMember

	// 모든회원의 정보를 리턴해주는 메소드 호출
	public Vector<MemberBean> allSelectMember() {
		// 가변길이로 데이터를 저장
		Vector<MemberBean> v = new Vector<>();

		// 무조건 데이터 베이스는 예외처리를 반드시 해야한다.
		try {
			// 데이터 베이스 접속
			getConnection();

			// 쿼리준비
			String sql = "select * from member";
			// 쿼리를 실행시켜주는 객체 선언
			pstmt = con.prepareStatement(sql);
			// 쿼리를 실행시킨 결과를 리턴해서 받아줌(MySQL 데이터베이스의 테이블의 검색된 결과를 자바객체에 저장)
			rs = pstmt.executeQuery();
			// 반복문을 사용해서 rs에 저장된 데이터를 추출 해놓는다.
			while (rs.next()) {// 저장된 데이터 만큼까지 반복문을 돌리겠다라는 뜻.
				MemberBean mbean = new MemberBean();// 컬럼으로 나뉘어진 데이터를 빈클래스에 저장
				mbean.setId(rs.getString(1));
				mbean.setPass1(rs.getString(2));
				mbean.setPass2(rs.getString(3));
				mbean.setEmail(rs.getString(4));
				mbean.setTel(rs.getString(5));
				mbean.setHobby(rs.getString(6));
				mbean.setJob(rs.getString(7));
				mbean.setAge(rs.getString(8));
				mbean.setInfo(rs.getString(9));
				// 패키징된 MemberBean클래스를 벡터에 저장
				v.add(mbean);// 0번지부터 순서대로 데이터가 저장
			} // end of while
				// 자원 반납
			con.close();
		} catch (Exception e) {

		} // end of try-catch
			// 다 저장된 벡터를 리턴
		return v;
	}// end of allSelectMember

	// 한사람에 대한 정보를 리턴하는 메소드 작성
	public MemberBean oneSelectMember(String id) {

		// 한 사람에 대한 정보만 리턴하기에 빈클래스 객체 생성
		MemberBean mbean = new MemberBean();

		try {
			// 커넥션 연결
			getConnection();
			// 쿼리 준비
			String sql = "select * from member where id=?";
			pstmt = con.prepareStatement(sql);

			// ?에 값을 맵핑
			pstmt.setString(1, id);
			// 쿼리 실행
			rs = pstmt.executeQuery();

			if (rs.next()) {// 데이터가 존재 한다면
				mbean.setId(rs.getString(1));
				mbean.setPass1(rs.getString(2));
				mbean.setPass2(rs.getString(3));
				mbean.setEmail(rs.getString(4));
				mbean.setTel(rs.getString(5));
				mbean.setHobby(rs.getString(6));
				mbean.setJob(rs.getString(7));
				mbean.setAge(rs.getString(8));
				mbean.setInfo(rs.getString(9));
			} // end of if
				// 자원반납
			con.close();

		} catch (Exception e) {
		} // end of try-catch
		return mbean;
	}// end of oneSelectMember

	// 한 회원의 패스워드 값을 리턴하는 메소드 작성
	public String getPass(String id) {
		// String으로 리턴해야하기에 스트링변수 선언
		String pass = "";
		try {
			getConnection();
			String sql = "select pass1 from member where id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			// 쿼리실행
			rs = pstmt.executeQuery();
			if (rs.next()) {
				pass = rs.getString(1);// 패스워드 값이 저장 된 컬럼 인덱스
			} // end of if
				// 자원 반납
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		} // end of try-catch
			// 결과를 리턴
		return pass;
	}// end of getPass

	// 한 회원의 정보를 수정하는 메소드
	public void updateMember(MemberBean bean) {
		getConnection();
		try {
			// 쿼리 준비
			String sql = "update member set email=?, tel=? where id =?";
			// 쿼리실행 객체 선언
			pstmt = con.prepareStatement(sql);
			// ?에 값을 맵핑
			pstmt.setString(1, bean.getEmail());
			pstmt.setString(2, bean.getTel());
			pstmt.setString(3, bean.getId());

			// 쿼리실행
			pstmt.executeUpdate();
			// 자원 반납
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		} // end of try-catch

	}// end of updateMember

	// 한 회원을 삭제하는 메소드 작성
	public void deleteMember(String id) {
		getConnection();

		try {
			// 쿼리준비
			String sql = "delete from member where id=?";

			// 쿼리실행 객체 선언
			pstmt = con.prepareStatement(sql);
			// ?에 값을 맵핑
			pstmt.setString(1, id);

			// 쿼리실행
			pstmt.executeUpdate();
			// 자원 반납
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		} // end of try-catch

	}// end of deleteMember

}// end of class
