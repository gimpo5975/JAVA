package listexam01;

public class Student {

	// #field
	private String name;
	private int age;

	// #constructor
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}// end of constructor

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}

}// end of class
