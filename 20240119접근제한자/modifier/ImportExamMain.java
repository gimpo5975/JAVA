package modifier;

import accessmodifier.sample.testExam.GetterSetter;

public class ImportExamMain {

	public static void main(String[] args) {
		GetterSetter gs = new GetterSetter();
		accessmodifier.test1.exam01.GetterSetter testGs = new accessmodifier.test1.exam01.GetterSetter();
//		Cde cde = new Cde(); => Cde클래스는 default라서 다른패키지에서 사용할 수 없다.
		
		gs.setName("김원중");
		testGs.setName("kwj");
		
		System.out.println(gs.getName());
		System.out.println(testGs.getName());
	}//end of main

}//end of class
