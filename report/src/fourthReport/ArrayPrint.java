package fourthReport;

//9. 다음에 제시된 배열을 차례로 출력하는 프로그램을 작성
//배열 fruits ={"사과","딸기","복숭아","바나나"}
//메소드 showFruits(String[] fruits)
//
//<출력형태>
//** 과일 이름 **
//사과
//딸기
//복숭아
//바나나
public class ArrayPrint {
	private static final String[] FRUITS = { "사과", "딸기", "복숭아", "바나나" };

	// entry point
	public static void main(String[] args) {
		showFruits(FRUITS);
	}// end of main

	private static void showFruits(String[] fruits) {
		System.out.println("🍌🍋🍊 과일 이름 🍉🍈🍇");
		for(int i=0;i<fruits.length;i++) {
			System.out.println(fruits[i]);
		}//end of for
	}//end of showFruits
	
}// end of class
