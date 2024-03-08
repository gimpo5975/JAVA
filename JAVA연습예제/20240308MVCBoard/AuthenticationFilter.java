package com.choong.web.command;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
@WebFilter(urlPatterns = { "/getBoardList.do", "/getBoard.do", "/deleteBoard.do" })
public class AuthenticationFilter extends HttpFilter implements Filter {
	private static final long serialVersionUID = 1L;// 직렬화

	public AuthenticationFilter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// 세션에 userId 정보가 등록되어 있는지 확인
		HttpServletRequest req = (HttpServletRequest) request;// 부모의 자식으로의 형변환
		HttpServletResponse res = (HttpServletResponse) response;// 부모의 자식으로의 형변환
		
		HttpSession session = req.getSession();//getSession()메소드는 HttpServletRequest 인터페이스에 있음
		if(session.getAttribute("user") == null) {
//			res.sendRedirect("/");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/");
			dispatcher.forward(request, response);
		}else {
			chain.doFilter(request, response);
		}//end of if
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}
}
