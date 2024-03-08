package com.choong.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.choong.biz.board.BoardDAO;
import com.choong.biz.board.BoardDTO;
import com.choong.biz.user.UserDAO;
import com.choong.biz.user.UserDTO;

@WebServlet("*.do")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 먼저 한글 필터 처리 부터 하기

	public DispatcherServlet() {
		super();

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// #1. 사용자 요청이 들어오면 요청 경로(path)를 추출
		final String URI = request.getRequestURI();
		final String PATH = URI.substring(URI.lastIndexOf("/"));

		// 요청에 따라 처리하기
		if (PATH.equals("/login.do")) {
			System.out.println("로그인 처리");

			String id = request.getParameter("id");// 아이디 = 문자열 로그인 화면에서 "id"라는 key의 값을 가져와서 id에 저장
			String password = request.getParameter("password");// 비밀번호 = 문자열 로그인 화면에서 "password"라는 key의 값을 가져와서
																// password에 저장

			UserDAO dao = new UserDAO();
			// UserDTO객체 생성해서 dao의 getUser메소드에 로그인화면에서 받아온 id를 매개 변수로 주어서
			// 그 id에 해당하는 유저의 정보를 저장한 객체를 저장
			UserDTO user = dao.getUser(id);

			HttpSession session = request.getSession();

			if (user != null && user.getId().equals(id) && user.getPassword().equals(password)) {
				session.setAttribute("user", user);

				RequestDispatcher dispatcher = request.getRequestDispatcher("/getBoardList.do");
				dispatcher.forward(request, response);
			} else {
				// id에 해당하는 사용자가 없을 때
				RequestDispatcher dispatcher = request.getRequestDispatcher("/login.do");
				dispatcher.forward(request, response);
			} // end of if

		} else if (PATH.equals("/insertUser.do")) {
			System.out.println("회원가입 처리");
			// 먼저 한글 필터 처리 부터 하기

			String id = request.getParameter("id");
			String password = request.getParameter("password");
			String name = request.getParameter("name");
			String role = request.getParameter("role");

			UserDTO dto = new UserDTO();
			dto.setId(id);
			dto.setPassword(password);
			dto.setName(name);
			dto.setRole(role);

			UserDAO dao = new UserDAO();
			dao.insertUser(dto);

			RequestDispatcher dispatcher = request.getRequestDispatcher("/");
			dispatcher.forward(request, response);

		} else if (PATH.equals("/logout.do")) {
			System.out.println("로그아웃 처리");

			HttpSession session = request.getSession();
			session.invalidate();

			RequestDispatcher dispatcher = request.getRequestDispatcher("/");
			dispatcher.forward(request, response);

		} else if (PATH.equals("/insertBoard.do")) {
			System.out.println("글 등록 처리");

			String title = request.getParameter("title");
			String writer = request.getParameter("writer");
			String content = request.getParameter("content");

			BoardDTO dto = new BoardDTO();
			dto.setTitle(title);
			dto.setWriter(writer);
			dto.setContent(content);

			BoardDAO dao = new BoardDAO();
			dao.insertBoard(dto);

			RequestDispatcher dispatcher = request.getRequestDispatcher("/getBoardList.do");
			dispatcher.forward(request, response);

		} else if (PATH.equals("/updateBoard.do")) {
			System.out.println("글 수정 처리");

			String title = request.getParameter("title");
			int seq = Integer.parseInt(request.getParameter("seq"));
			String content = request.getParameter("content");
////			String writer = request.getParameter("writer");

			BoardDTO dto = new BoardDTO();
			dto.setTitle(title);
			dto.setContent(content);
//			dto.setWriter(writer);
			dto.setSeq(seq);

			BoardDAO dao = new BoardDAO();
			dao.insertBoard(dto);

			// 업데이트 후에는 글 목록으로 이동

			RequestDispatcher dispatcher = request.getRequestDispatcher("/getBoardList.do");
			dispatcher.forward(request, response);
//		

		} else if (PATH.equals("/deleteBoard.do")) {
			System.out.println("글 삭제 처리");

			String seq = request.getParameter("seq");

			// 2. DB 연동 처리
			BoardDTO dto = new BoardDTO();
			dto.setSeq(Integer.parseInt(seq));

			BoardDAO boardDAO = new BoardDAO();
			boardDAO.deleteBoard(dto);

			// 3. 페이지 네비게이션
			RequestDispatcher dispatcher = request.getRequestDispatcher("/getBoardList.do");
			dispatcher.forward(request, response);

		} else if (PATH.equals("/getBoard.do")) {
			System.out.println("글 상세 조회 처리");
			// 타이틀 누르면 상세 조회되게

			// 사용자 입력 정보
			int seq = Integer.parseInt(request.getParameter("seq"));

			BoardDTO dto = new BoardDTO();
			dto.setSeq(seq);

			BoardDAO dao = new BoardDAO();
			BoardDTO board = dao.getBoard(dto);

			request.setAttribute("board", board);

			RequestDispatcher dispatcher = request.getRequestDispatcher("/board/getBoard.jsp");
			dispatcher.forward(request, response);

		} else if (PATH.equals("/getBoardList.do")) {
			System.out.println("글 목록 검색 처리");

			// 1. 사용자 입력정보 추출
			String searchCondition = request.getParameter("searchCondition");
			String searchKeyword = request.getParameter("searchKeyword");

			// Null Check
			if (searchCondition == null)
				searchCondition = "TITLE";
			if (searchKeyword == null)
				searchKeyword = "";

			// 세션에 검색 관련 정보를 저장한다.
			HttpSession session = request.getSession();
			session.setAttribute("condition", searchCondition);
			session.setAttribute("keyword", searchKeyword);

			// 2. DB 연동 처리
			BoardDTO dto = new BoardDTO();
			dto.setSearchCondition("TITLE");
			dto.setSearchKeyword("");

			BoardDAO dao = new BoardDAO();
			List<BoardDTO> boardList = dao.getBoardList(dto);

			// 3. 화면 이동
			request.setAttribute("boardList", boardList);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/board/getBoardList.jsp");
			dispatcher.forward(request, response);

		} else if (PATH.equals("/loginView.do")) {
			System.out.println("로그인 화면으로 이동");

			RequestDispatcher dispatcher = request.getRequestDispatcher("/board/login.jsp");
			dispatcher.forward(request, response);

		} else if (PATH.equals("/insertBoardView.do")) {
			System.out.println("글 등록 화면으로 이동");

			RequestDispatcher dispatcher = request.getRequestDispatcher("/board/insertBoard.jsp");
			dispatcher.forward(request, response);

		} else if (PATH.equals("/insertUserView.do")) {
			System.out.println("회원 가입 화면으로 이동");

			RequestDispatcher dispatcher = request.getRequestDispatcher("/board/insertUser.jsp");
			dispatcher.forward(request, response);

		} // end of if

	}// end of service

}// end of class
