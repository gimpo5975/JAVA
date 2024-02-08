package genericexam2;

public class Box<V, K> {

	// 필드
	private V name;
	private K age;

	// getter / setter
	public V getName() {
		return name;
	}

	public void setName(V name) {
		this.name = name;
	}

	public K getAge() {
		return age;
	}

	public void setAge(K age) {
		this.age = age;
	}

	// 메소드
	public V showInfo() {
		return (V) ("name = " + name + "age = " + age);
	}

}// end of class
