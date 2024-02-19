package testconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dbconnection.MyDBConnection;

public class MyDBExam {
	// entry point
	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// java에서는 sql구문을 문자열로 처리
		String sql = "insert into member(memberId,memberName) values(?, ?)";

		try {
			con = MyDBConnection.getConnection();// db 연결
			pstmt = con.prepareStatement(sql);// sql문 전달
			pstmt.setInt(1, 2);//pk 
			pstmt.setString(2, "김자바");

			// sql문 실행
			// executeUpdate() : insert, update, delete
			// executeQuery() : select
			int result = pstmt.executeUpdate();
			System.out.println("실행결과 : " + result);
		} catch (SQLException e) {
			System.out.println("예외 발생");
		} finally {
			MyDBConnection.close(con, pstmt, rs);
		} // end of try-catch

	}// end of main
}// end of class
