package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static dbconnection.DBCon.*;

public class MyDBConnection {

	public static Connection getConnection() throws SQLException {
		Connection con = null;
		con = DriverManager.getConnection(URL, USER, PASSWORD);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("DB접속 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();// 나중에 제거 또는 주석
		} // end of try-catch
		return con;
	}// end of getConnection

	public static void close(ResultSet rs, PreparedStatement pstmt, Connection con) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} // end of try-catch
			System.out.println("rs 닫기 성공");
		} // end of if
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} // end of try-catch
			System.out.println("pstmt 닫기 성공");
		} // end of if
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} // end of try-catch
			System.out.println("con 닫기 성공");
		} // end of if
	}// end of close

}// end of class
