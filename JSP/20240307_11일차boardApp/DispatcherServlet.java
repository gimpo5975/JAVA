package com.choong.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// constructor
	public DispatcherServlet() {
		super();
	}// end of constructor

	// method
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1) 사용자 요청이 들어오면 요청 경로(path)를 추출
		// request는 HttpServletRequest 객체로, 클라이언트로부터의 HTTP 요청을 나타냅니다.
		// getRequestURI() 메서드는 이 객체에서 현재 요청의 URI를 가져옵니다. URI는 요청한
		// 자원을 식별하는 데 사용되는 특정한 경로를 나타냅니다.
		// URI는 스키마(일반적으로 "http" 또는 "https"), 호스트명, 포트 번호, 경로 및 선택적인 쿼리 문자열을 포함할 수 있습니다.
		final String URI = request.getRequestURI();
		// , URI가 "/example/path"라면 lastIndexOf("/")는 8을 반환하고, 이에 따라 substring(8)은
		// "/path"를 반환합니다.
		// 그리고 이 부분이 PATH 변수에 저장됩니다.
		final String PATH = URI.substring(URI.lastIndexOf("/"));

		// 요청에 따라 처리하기
		if (PATH.equals("/login.do")) {
			System.out.println("로그인 처리");
		} else if (PATH.equals("/insertUser.do")) {
			System.out.println("회원가입 처리");
		} else if (PATH.equals("/logout.do")) {
			System.out.println("로그아웃 처리");
		} else if (PATH.equals("/insertBoard.do")) {
			System.out.println("글 등록 처리");
		} else if (PATH.equals("/updateBoard.do")) {
			System.out.println("글 수정 처리");
		}else if(PATH.equals("/deleteBoard.do")) {
			System.out.println("글 삭제 처리");
		}else if(PATH.equals("/getBoard.do")) {
			System.out.println("글 상세 조회 처리");
		}else if(PATH.equals("/getBoardList.do")) {
			System.out.println("글 목록 검색 처리");
		}else if(PATH.equals("/loginView.do")) {
			System.out.println("로그인 화면으로 이동 처리");
		}else if(PATH.equals("/insertBoardView.do")) {
			System.out.println("글 등록화면으로 이동 처리");
		}else if(PATH.equals("/insertUserView.do")) {
			System.out.println("회원가입 화면으로 이동 처리");
		}
	}// end of service

}// end of class
