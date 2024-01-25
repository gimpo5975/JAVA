package class1;

public class StudentMainExam {

	public static void main(String[] args) {
		//#1. 설계도(클래스)를 가져다 객체(인스턴스) 만들기
		Student st = new Student();
		
		//#2. 만든 객체 사용
		//#2-1. 객체 안에(뱃속) 있는 필드에 값을 담기
		st.name = "원중";
		st.age = 28;
		st.score = 100;
		
		//#2-2. 겍체의 (뱃속에 있는) 필드 내용 읽어 오기
		System.out.println("st.name = " + st.name);
		System.out.println("st.age = " + st.age);
		System.out.println("st.score = " + st.score);
		System.out.println();
		
		//#2-2. 겍체의 (뱃속에 있는) 메소드를 호출
		st.gotoSchool();
		
	}// end of main

}// end of class
