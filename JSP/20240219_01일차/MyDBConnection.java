package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static dbconnection.MyDBConnectionCon.*;

public class MyDBConnection {// db 접속과 접속 끊기

	public static Connection getConnection() {
		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// MySQL용 JDBC 드라이버 클래스를 로드
			con = DriverManager.getConnection(URL, USER, PASSWORD);// URL, 사용자 이름 및 비밀번호를 사용하여 데이터베이스에 대한 연결
			System.out.println("DB 접속 성공");
		} catch (ClassNotFoundException e) {// JDBC 드라이버 클래스를 찾을 수 없는 경우 예외를 포착
			System.out.println("찾는 파일 없음");
		} catch (SQLException e) {// SQL 또는 데이터베이스 연결과 관련된 예외를 포착
			System.out.println("접속 예외 발생");
		} // end of try-catch
		return con;
	}// end of getConnection

	// 열려있는 자원을 닫아주는 메소드
	public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
				System.out.println("rs 닫기 성공");// 확인 후 주석 처리 또는 제거
			} catch (SQLException e) {
				System.out.println("rs 닫기 실패");// 확인 후 주석 처리 또는 제거
			} // end of try-catch
		} // end of if
		if (pstmt != null) {
			try {
				pstmt.close();
				System.out.println("pstmt 닫기 성공");// 확인 후 주석 처리 또는 제거
			} catch (SQLException e) {
				System.out.println("pstmt 닫기 실패");// 확인 후 주석 처리 또는 제거
			} // end of try-catch
		} // end of if
		if (con != null) {
			try {
				con.close();
				System.out.println("con 닫기 성공");// 확인 후 주석 처리 또는 제거
			} catch (SQLException e) {
				System.out.println("con 닫기 실패");// 확인 후 주석 처리 또는 제거
			} // end of try-catch
		} // end of if
	}// end of close

}// end of class
