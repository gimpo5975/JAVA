package threadExam01;

public class CreateAndStartThreadExam {

	public static void main(String[] args) {

		// #1. 메인쓰레드 부분
		System.out.println("메인 쓰레드 실행...");
		System.out.println("즐거운 시간...");

		// #2. 영상 쓰레드 생성
		// 쓰레드를 실행하기 위해서는 쓰레드 객체 생성
		Thread movieThread = new MovieThread();

		// #2-1. 영상 쓰레드 실행
		movieThread.start();

		System.out.println();

		// #3. 자막 쓰레드 생성
		Thread subtitleThread = new SubtitleThread();

		// #3-2 자막 쓰레드 실행
		subtitleThread.start();

		// #4. 메인 쓰레드 부분
		System.out.println("다시 메인 쓰레드 부분");

	}// end of main

}// end of class
