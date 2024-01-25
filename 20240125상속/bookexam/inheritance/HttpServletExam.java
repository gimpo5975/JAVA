package bookexam.inheritance;

public class HttpServletExam {

	public static void main(String[] args) {

		method(new LoginServlet());
		method(new FileDownServlet());
		
	}//end of main
	
	public static void method(HttpServlet servlet) {
		servlet.service();
	}//end of method()

}//end of class
