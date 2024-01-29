package exam.arrayList.book560;

public class Board {

	// #필드
	private String subject;
	private String content;
	private String Writer;

	// #생성자
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		Writer = writer;
	}// end of constructor

	// 메소드
	// getter / setter
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return Writer;
	}

	public void setWriter(String writer) {
		Writer = writer;
	}

	@Override//object의 toString()메소드를 제정의
	public String toString() {
		return "Board [subject=" + subject + ", content=" + content + ", Writer=" + Writer + "]";
	}

}// end of class
