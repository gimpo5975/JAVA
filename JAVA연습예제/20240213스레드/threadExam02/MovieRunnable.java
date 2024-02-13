package threadExam02;

public class MovieRunnable implements Runnable {
	@Override
	public void run() {// 멀티 쓰레드로 작업할 내용을 넣기

		// #1-1. 영상설정
		String[] strVideoArray = { "movie1", "movie2", "movie3", "movie4", "movie5" };

		// #2-1. 영상 실행
		for (int i = 0; i < strVideoArray.length; i++) {
			System.out.print(strVideoArray[i] + "\t");

			try {
				Thread.sleep(500);// 0.5초 단위로 멈춤
			} catch (InterruptedException e) {
				System.out.println("예외가 발생하였습니다.");
			} // end of try/catch

		} // end of for

	}// end of run

}
