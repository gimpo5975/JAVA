package accessmodifier;

public class GetterSetterExam {
	// #1. 필드
	private String id = "kwj";
	private String password = "5975";

	// #2. 생성자 => 기본 생성자 생략되어 있음
	public GetterSetterExam() {
	}//end of GetterSetterExam()

	public GetterSetterExam(String id, String password) {
		this.id = id;
		this.password = password;
	}// end of GetterSetterExam()

	// #3. 메소드
	// getter : private으로 선언된 필드를 읽어서 넘겨주는 역할
	// 필드명 앞에 get을 붙이고 필드명의 첫 글자를 대문자로
	// boolean형은 필드명의 첫 글자에 is를 붙이고 첫글자를 대문자로

	// setter : private으로 선언된 필드를 수정
	// 필드명 앞에 set붙이고 필드명의 첫글자를 대문자
	// boolean형은 필드명의 첫 글자에 is를 붙이고 첫 글자를 대문자로

	public void show() {
		System.out.println("id = " + id);
	}// end of show()

	public String getId() {
		// 유효성 검사
		return id;
	}// end of getId()

	public void setId(String id) {
		this.id = id;
	}
}// end of class
