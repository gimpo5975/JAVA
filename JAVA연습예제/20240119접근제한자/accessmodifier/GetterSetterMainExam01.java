package accessmodifier;

public class GetterSetterMainExam01 {

	public static void main(String[] args) {
		GetterSetterExam gs = new GetterSetterExam();
		
//		id가 private라 다른 클래스에서 사용 불가능
//		gs.id = "김원중";
		
		gs.show();
		
		String result = gs.getId();
		gs.setId("김원중");
		
		gs.show();
		
		GetterSetterExam gs2 = new GetterSetterExam("jung", "5795");
		gs2.show();
		
	}//end of main

}//end of class
