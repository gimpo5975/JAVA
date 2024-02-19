package setexam;

import java.util.Objects;

public class Person implements Comparable<Person> {

	// #field
	String name;
	int age;

	// #constructor
	public Person() {
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	// 정렬을 위한 값을 비교 
	@Override
	public int compareTo(Person o) {
		if (age > o.age) {
			return 1;
		} else if (age == o.age) {
			return 0;
		} else {
			return -1;
		}
	}// compareTo

}// end of class
