package com.choong.biz.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbconnection.MyDBConnection;

public class UserDAO {
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	private String USER_GET = "select * from users where id=?";
	private String USER_DELETE = "delete from users where id=?";
	private String USER_LIST = "select * from users";
	private String USER_INSERT = "insert into users values(?,?,?,?)";
	private String USER_UPDATE = "update users set name=?, role=? where id=?";

	// 회원 관련 CRUD(create, read, update, delete )
	// 1. 회원 상세 조회
	public UserDTO getUser(String id) { // DispacherServlet 수정
		UserDTO user = null;

		try {
			con = MyDBConnection.getConnection();
			// 연결한 데이터베이스에 쿼리문 전달
			pstmt = con.prepareStatement(USER_GET);

			// 쿼리문 ?에 값 매핑
			pstmt.setString(1, id);

			// 쿼리문 실행하고 rs에 저장
			rs = pstmt.executeQuery();

			if (rs.next()) {
				// UserDTO 객체 생성
				user = new UserDTO();

				user.setId(rs.getString("id"));// 데이터베이스에서 가져온 속성명 "id"의 값을 user의 id에 저장
				user.setPassword(rs.getString("password"));// 데이터베이스에서 가져온 속성명 "password"의 값을 user의 password에 저장
				user.setName(rs.getString("name"));// 데이터베이스에서 가져온 속성명 "name"의 값을 user의 name에 저장
				user.setRole(rs.getString("role"));// 데이터베이스에서 가져온 속성명 "role"의 값을 user의 role에 저장

			} // end of if

		} catch (Exception e) {
		} finally {
			MyDBConnection.close(rs, pstmt, con);
		} // end of try-catch
			// 데이터베스에서 가져온 값을 다 넣은 객체 user를 리턴으로 넘겨 줌
		return user;
	}// end of getUser

	// 2. 회원 삭제
	public void deleteUser(String id) {

		try {
			con = MyDBConnection.getConnection();
			pstmt = con.prepareStatement(USER_DELETE);
			pstmt.setString(1, id);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MyDBConnection.close(rs, pstmt, con);
		}
	}

//	private String USER_UPDATE = "update users set name=?, role=? where id=?";
	// 3. 회원 수정
	public void updateUser(UserDTO dto) {

		try {
			con = MyDBConnection.getConnection();
			pstmt = con.prepareStatement(USER_UPDATE);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getRole());
			pstmt.setString(3, dto.getId());

			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MyDBConnection.close(rs, pstmt, con);
		}

	}

//	private String USER_INSERT = "insert into users values(?,?,?,?)";
	// 4. 회원 등록
	public void insertUser(UserDTO dto) {

		try {
			con = MyDBConnection.getConnection();
			pstmt = con.prepareStatement(USER_INSERT);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPassword());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getRole());

			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MyDBConnection.close(rs, pstmt, con);
		}

	}

//	private String USER_LIST = "select * from users";
	// 5. 회원 목록 조회
	public List<UserDTO> getUserList() {
		List<UserDTO> userList = new ArrayList<UserDTO>();

		try {
			con = MyDBConnection.getConnection();
			pstmt = con.prepareStatement(USER_LIST);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				UserDTO user = new UserDTO();

				user.setId(rs.getString("id"));
				user.setPassword(rs.getString("password"));
				user.setName(rs.getString("name"));
				user.setRole(rs.getString("role"));

				userList.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MyDBConnection.close(rs, pstmt, con);
		}
		return userList;
	}
}
