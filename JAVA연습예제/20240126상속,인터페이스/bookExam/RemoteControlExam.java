package interfaceExam.bookExam;

public class RemoteControlExam {

	public static void main(String[] args) {

		// 부모타입의 자식객체 생성
		RemoteControl tv = new Television();
		RemoteControl ad = new Audio();

		// 부모타입 배열에 자식객체 넣기
		RemoteControl[] rcArr = { tv, ad };

		// 향상된 for문으로 메소드 호출
		for (RemoteControl rcArray : rcArr) {
			System.out.println("******************");
			rcArray.turnOn();
			rcArray.turnOff();
			rcArray.setVolume(10);

			// 자식 -> 부모 -> 자식
			if (rcArray instanceof Television tv2) {
				tv2.setVolume(5);
			} // end of if

			// 자식 -> 부모 -> 자식
			if (rcArray instanceof Audio ad2) {
				ad2.setVolume(5);
			} // end of if

		} // end of for

	}// end of main

}// end of class
