package honggongja.sec06;

public class StudentExanple {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
	}

}
