package classExam;

public class StudentMain {

	public static void main(String[] args) {
		
		Student student1 = new Student("김원중", 12345);
		Student student2 = new Student("누군가", 54321);
		
		student1.inputSubjectScore();
		student1.showInfo();
		
		student2.inputSubjectScore();
		student2.showInfo();
		
	}//end of main

}//end of class
