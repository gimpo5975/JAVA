package genericExam;

public class BoxGeneric<T> {

	private T name;
	private T kind;

	public void set(T name) {
		this.name = name;
	}// end of set

	public T get() {
		return name;
	}

	public void show() {
		System.out.println(name + ", " + kind);
	}

}// end of class
