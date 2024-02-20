package memeber;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dbconnection.MyDBConnection;

public class MemberSelectMain_refactor {

	// entry point
	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// sql문 String 객체에 저장
		String sql = " select memberId, memberName " + " from member ";

		try {
			// DB 접속
			con = MyDBConnection.getConnection();
			// sql문 전달
			pstmt = con.prepareStatement(sql);

			// sql 실행 시키고 가져오기
			rs = pstmt.executeQuery();

			// 가져온 결과를 확인하기
			while (rs.next()) {
				Member member = new Member();

				// 값을 가져와서 Member 객체의 필드에 저장
				member.setMemberId(rs.getInt(1));
				member.setMemberName(rs.getString(2));

				System.out.println(member);
			}
			System.out.println("자료 없음");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MyDBConnection.close(rs, pstmt, con);// 접속 닫아주기
		} // end of try-catch

	}// end of main

}// end of class
