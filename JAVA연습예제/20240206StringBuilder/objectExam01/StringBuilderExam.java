package objectExam01;

public class StringBuilderExam {

	// entry point
	public static void main(String[] args) {

		StringBuilder str = new StringBuilder();

		str.append("안녕\t");
		str.append("하위!!!\t");
		str.append("안녕이라고~~~!!!!!");
		System.out.println(str);
		
		str.delete(1, 4);
		System.out.println(str);
		
	}// end of main

}// end of class
