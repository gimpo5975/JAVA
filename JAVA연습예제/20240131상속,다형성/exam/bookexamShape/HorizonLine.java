package exam.bookexamShape;

public class HorizonLine extends Line {

	@Override
	public void draw() {
		System.out.println("원하시는 선의 길이 선택해 주세요.");
		int num = sc.nextInt();
		for (int i = 0; i <= num; i++) {
			System.out.print("-");
		}//end of for
		System.out.println();
	}//end of draw()

}//end of class
