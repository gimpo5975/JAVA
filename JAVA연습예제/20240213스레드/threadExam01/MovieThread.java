package threadExam01;

public class MovieThread extends Thread {

	@Override
	public void run() {// 멀티 쓰레드로 작업할 내용을 넣기

		// #1-1. 영상설정
		String[] strVideoArray = { "영상1", "영상2", "영상3", "영상4", "영상5" };

		// #2-1. 영상 실행
		for (int i = 0; i < strVideoArray.length; i++) {
			System.out.print("비디오 장면 : " + strVideoArray[i] + "\t");

			try {
				Thread.sleep(500);// 0.5초 단위로 멈춤
			} catch (InterruptedException e) {
				System.out.println("예외가 발생하였습니다.");
			} // end of try/catch

		} // end of for

	}// end of run
}// end of class
