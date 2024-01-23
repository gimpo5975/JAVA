package classExam;

public class StudentMainRefactor {

	public static void main(String[] args) {
//		StudentRefactor kim = new StudentRefactor("김원중", "5975", 90, 80, 97);
//
//		kim.scoreCalc();
//		kim.studentInfo();

		StudentRefactor[] std = { new StudentRefactor("김원중", "5975", 90, 80, 97),
				new StudentRefactor("김원하", "4565", 90, 80, 97), new StudentRefactor("김원상", "7855", 90, 80, 97) };

//		for (int i = 0; i < std.length; i++) {
//			std[i].scoreCalc();
//			System.out.println();
//			std[i].studentInfo();
//			System.out.println();
//		} // end of for

		// 향상된 for문
		for (StudentRefactor st : std) {
			st.scoreCalc();
			System.out.println();
			st.studentInfo();
			System.out.println();
		} // end of for

	}// end of main

}// end of class
