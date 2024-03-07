package com.choong.bl.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dbconnection.MyDBConnection;

public class UserDAO {

	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	// userDTO sql문
	private String USER_LIST = "select * from users";
	private String USER_INSERT = "insert into users values(?,?,?,?)";
	private String USER_UPDATE = "update users set name=?, role=? where id=?";
	private String USER_DELETE = "delete users where id=?";
	private String USER_GET = "select * from users where id=?";

	// 회원 관련 CRUD(create, read, update, delete)
	// 1. 회원 상세 조회
	public UserDTO getUser(String id) {// DispatcherServlet 수정
		UserDTO user = null;

		try {
			con = MyDBConnection.getConnection();
			pstmt = con.prepareStatement(USER_GET);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				user = new UserDTO();
				user.setId(rs.getString("id"));
				user.setPassword(rs.getString("password"));
				user.setName(rs.getString("name"));
				user.setRole(rs.getString("role"));
			} // end of if

		} catch (Exception e) {
		} finally {
			MyDBConnection.close(rs, pstmt, con);
		} // end of try-catch
		return user;
	}// end of getUser

	// 2. 회원 삭제
	public void deleteUser(String id) {
		try {
			con = MyDBConnection.getConnection();
			pstmt = con.prepareStatement(USER_DELETE);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
		} catch (Exception e) {
		} finally {
			MyDBConnection.close(rs, pstmt, con);
		} // end of try-catch
	}// end of deleteUser

	// 3. 회원 수정
	public void updateUser(UserDTO dto) {
		try {
			con = MyDBConnection.getConnection();
			pstmt = con.prepareStatement(USER_UPDATE);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getRole());
			pstmt.setString(3, dto.getId());

			pstmt.executeUpdate();

		} catch (Exception e) {
		} finally {
			MyDBConnection.close(rs, pstmt, con);
		} // end of try-catch
	}// end of updateUser

	// 4. 회원 등록
	public void insertUser(UserDTO dto) {
		try {
			con = MyDBConnection.getConnection();
			pstmt = con.prepareStatement(USER_INSERT);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPassword());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getRole());

			pstmt.executeQuery();
		} catch (Exception e) {
		} finally {
			MyDBConnection.close(rs, pstmt, con);
		} // end of tty-catch
	}// end of insertUser
		// 5. 회원 목록 조회

	public List<UserDTO> getUserList() {
		List<UserDTO> userList = new ArrayList<>();
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
			}//end of while
			
		} catch (Exception e) {
		} finally {
			MyDBConnection.close(rs, pstmt, con);
		} // end of try-catch
		return userList;
	}// end of getUserList()
}// end of class