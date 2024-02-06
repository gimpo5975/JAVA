package objectExam01;

import java.util.Objects;

public class Dog {

	String name;
	
	public Dog(String name) {
		super();
		this.name = name;
	}

	@Override // Object의 toString()메소드를 재정의
	public String toString() {
		return "Dog name = " + name;
	}// end of toString

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return Objects.equals(name, other.name);
	}

	
	
}// end of class
