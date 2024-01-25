package bookexam.inheritance;

public class FileDownServlet extends HttpServlet {
	@Override
	public void service() {
		System.out.println("다운로드합니다.");
	}// end of service()
}// end of class
