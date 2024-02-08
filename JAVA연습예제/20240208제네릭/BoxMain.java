package genericexam2;

public class BoxMain {

	public static void main(String[] args) {

		Box<String, Integer> box = new Box<String, Integer>();
		Box<Animal, Integer> box1 = new Box<Animal, Integer>();
		Box<String, String> box2 = new Box<String, String>();
		
		////////////////////////////////////////////////////////////////////////////////////////////
		//box
		box.setName("홍길동");
		String name = box.getName();
		System.out.println(name);
		
		box.setAge(15);
		int age = box.getAge();
		System.out.println(age);
		//////////////////////////////////////////////////////////////////////////////////////
		//box1
		box1.setName(new Animal());
		Animal ani = box1.getName();
		
		
	}//end of main

}//end of class
