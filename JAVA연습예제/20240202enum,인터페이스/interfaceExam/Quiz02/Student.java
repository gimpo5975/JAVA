package interfaceExam.Quiz02;

public class Student {

	// #필드
	private String name;
	private String department;

	// #생성자
	public Student(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}// end of constructor

	// #getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}// end of class
