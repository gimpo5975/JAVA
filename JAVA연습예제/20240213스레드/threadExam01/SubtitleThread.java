package threadExam01;

public class SubtitleThread extends Thread {
	@Override
	public void run() {// 멀티 쓰레드로 작업할 내용을 넣기
		// 자막으로 처리할 내용, 멀티 쓰레드에서 실행할 내용
		// #1-2. 자막설정
		String[] intSubtitleArray = { "자막1", "자막2", "자막3", "자막4", "자막5" };

		try {
			Thread.sleep(100);//자막을 0.1초 정도 늦게 출력되도록 설정
			//멀티 쓰레드는 독립적으로 실행되기 때문에 먼저 start() 메소드로 호출해도
			//나중에 실행된 쓰레드 보다 늦게 실행 될 수 있음
		} catch (InterruptedException e1) {
			System.out.println("예외가 발생하였습니다.");
		}

		// #2-2. 자막 실행
		for (int i = 0; i < intSubtitleArray.length; i++) {
			System.out.print("자막 장면 : " + intSubtitleArray[i] + "\t");

			try {
				Thread.sleep(500);// 0.5초 단위로 멈춤
			} catch (InterruptedException e) {
				System.out.println("예외가 발생하였습니다.");
			} // end of try/catch

		} // end of for

	}// end of run
}// end of class