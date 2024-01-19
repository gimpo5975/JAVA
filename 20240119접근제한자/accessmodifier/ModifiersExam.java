package accessmodifier;

public class ModifiersExam {

	public static void main(String[] args) {
		Modifiers mf = new Modifiers();

		// 필드의 접근제한자 => private
		// System.out.println(mf.priName);
		// System.out.println(mf.priAge);

		// 필드의 접근제한자 => default
		System.out.println(mf.defName);
		System.out.println(mf.defAge);
		mf.defAge = 10;
		mf.defName = "보통보통";

		// 필드의 접근제한자 => public
		System.out.println(mf.pubName);
		System.out.println(mf.pubAge);
		mf.pubAge = 10;
		mf.pubName = "보통보통";

		mf.showInfo();
	}// end of main

}// end of class
