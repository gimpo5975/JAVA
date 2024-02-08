package fourthReport.cat;

public class Cat {

	// 필드
	private String species; // 종
	private String name;// 이름
	private int age;// 나이

	// 생성자

	// 메소드
	public void catInfo(String name,String species ,int age) {
		System.out.println(name + "는 " + age + "살 " + species + "입니다.");
	}// end of catInfo

	public void run(String name) {
		System.out.println(name + "이 담자위를 뛰어가고 있습니다.");
	}// end of run

}// end of class
