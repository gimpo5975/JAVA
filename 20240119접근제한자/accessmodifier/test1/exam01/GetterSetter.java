package accessmodifier.test1.exam01;

public class GetterSetter {
	//필드
	private String name;
	private int age;
	private int score;
	
	//생성자
	public GetterSetter() {
		super();
	}

	public GetterSetter(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	//getter setter
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}


}// end of class
