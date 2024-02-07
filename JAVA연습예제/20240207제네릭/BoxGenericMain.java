package genericExam;

public class BoxGenericMain {

	public static void main(String[] args) {

		BoxGeneric<String> box = new BoxGeneric<String>();
		box.set("김원중");
		box.show();
		
		BoxGeneric<Integer> boxIn = new BoxGeneric<Integer>();
		
		BoxGeneric<Cat> boxCat = new BoxGeneric<Cat>();
		boxCat.set(new Cat());
		boxCat.show();
		
	
	
	
	
	}// end of main

}// end of class
