package collectionexam;

public class Board {// BluePrint

	// #instance field
	private String subject;
	private String content;
	private String writer;

	// #constructor => initialize instance
	public Board() {};
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}// end of constructor

	// method
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
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "[subject = " + subject + ", content = " + content + ", writer = " + writer + "]";
	}

	
	
}// end of class
