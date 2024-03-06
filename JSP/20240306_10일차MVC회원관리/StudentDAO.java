package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DTO.Student;
import dbconnection.MyDBConnection;

public class StudentDAO { // db에 자료를 전달, db자료를 가져오기
		// private Connection con = null;
		// private PreparedStatement pstmt = null;
		// private ResultSet rs = null;
		
		Connection con = null; // db연결
		PreparedStatement pstmt = null; //sql 전달 
		ResultSet rs = null; //sql 실행, 결과 받기
	
		//학생 등록 - insert를 위한 것,
		// 폼으로부터 입력 컨트롤러가 가져다가 DTO라는 수레 담아서 DAO에 보내줘서 이것을 db에 삽입
		public void insert(Student student) { //DTO 수레를 매개값으로 받는 것
			
			//String sql = "insert into student(id, name, email) values(?, ? , ?)";
		      String sql = "insert into student values(?, ? , ?)";
			
			
			  try {
				con = MyDBConnection.getConnection();
				pstmt = con.prepareStatement(sql);
				
				pstmt.setInt(1, student.getId());
				pstmt.setString(2, student.getName());
				pstmt.setString(3, student.getEmail());
				
				pstmt.executeUpdate(); //insert, delete, update				
				
			} catch (SQLException e) {
				e.printStackTrace(); //프로그램 완료후에는 주석 또는 제거
			}finally {
				MyDBConnection.close(rs, pstmt, con);
			}		
			
		}//end of insert()
		
		//학생 리스트 - 전체 자료를 출력하기 위한 목적
		//  db에서 전체리스트 읽어와서 dto 수레에 담아서 컨트롤러에게 전달
		public List<Student> getAll() {   //findAll()
			List<Student> students = new ArrayList<>(); //new ArrayList<Student>();
			
			//String sql = "select id, name, email from student";
			String sql = "select * from student";
			
			    try {
					con = MyDBConnection.getConnection();
					pstmt = con.prepareStatement(sql);
					rs = pstmt.executeQuery();  //select
					
					//ResultSet에 있는 내용을 가져오기
					while(rs.next()) {
						//Student라는 객체를 생성해서 자료를 담기
						Student std = new Student();  //각 자료에 대한 객체
						
						std.setId(rs.getInt(1));  //id
						std.setName(rs.getString(2)); //name
						std.setEmail(rs.getString(3)); //email
						
						//객체를 ArrayList 배열에 추가
						students.add(std);
						
					}//end of while				
					
				} catch (SQLException e) {
					System.out.println("예외 발생");
					
				}finally { // 리소스 닫기
					MyDBConnection.close(rs, pstmt, con);
				}//end of try
			 
			    return students;			
		 }//end of getAll()
		
	
}//end of class
