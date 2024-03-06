package controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.StudentDAO;
import DTO.Student;


@WebServlet("/scontrol")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	StudentDAO dao;

    public StudentController() {
        super();
    }

	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		dao = new StudentDAO();	
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//한글 처리
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String view = ""; //이동할 뷰페이지 담기
		String action = request.getParameter("action");
		
		if(action==null) {
			getServletContext().getRequestDispatcher("/scontrol?action=list")
			.forward(request, response);
			
		}else {
			//send, insert, list
			switch(action) {
				case "list" : view = list(request, response); break;   //"studentInfo.jsp"
				case "insert" : view = insert(request, response); break;  //"studentInsert.jsp"
				case "send" : view = "studentInsert.jsp"; break;
			}
			
			getServletContext().getRequestDispatcher("/studentView/" + view)
			.forward(request, response);
			
		}	
	}
	
	// list
	public String list(HttpServletRequest request, HttpServletResponse response) {
		// dao.getAll()을 호출 -> 처리 -> 처리한 결과를 request scope object의 속성에 저장하고 보내기
		//  속성 : students 라는 이름으로 설정, 이곳에 dao.getAll()호출해서 가져온 결과 담기
		request.setAttribute("studentAll", dao.getAll());
		return "studentInfo.jsp"; //view 페이지 리턴
	}
	
	
	// insert
	public String insert(HttpServletRequest request, HttpServletResponse response) {
		//새로운 학생을 추가하는 -> 컨트롤러 -> insert( )메소드
		// request.getParameter()를 이용해서 모든 입력값을 읽어와서
		// Student 객체로 매핑한 다음
		// dao.insert() 메소드 호출하고, 뷰페이지로 이동
		
		Student std = new Student();
		// 문자열로 들어옴
		int id = Integer.parseInt(request.getParameter("id"));
		std.setId(id);
		std.setName(request.getParameter("name"));
		std.setEmail(request.getParameter("email"));
		
		dao.insert(std);		
		return "studentInsert.jsp"; //view 페이지를 리턴
	}
	
}
