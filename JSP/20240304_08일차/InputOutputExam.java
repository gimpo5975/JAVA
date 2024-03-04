package fileInputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InputOutputExam {

	public static void main(String[] args) {

		String input = "c:\\temp\\a.txt";
		String output = "c:\\temp\\b.txt";

		// 파일입력 스트림 : 파일읽어오기 -> 처리 -> 종려(close)
		// 파일 출력 스트림 : 파일을 열기 -> 처리 -> 종료(close)
		// try-with-resource : close()를 자동 처리, 자동으로 리소스 닫기
		try (FileInputStream fis = new FileInputStream(input); FileOutputStream fos = new FileOutputStream(output)) {

			// file을 읽어서 file로 내보내기
			int c;// fis.read() 1byte씩 읽어오기
					// 더 이상 읽어올 내용이 없으면 -1 리턴
			while ((c = fis.read()) != -1) {
				fos.write(c);// 1byte씩 쓰기
			} // end of while

		} catch (Exception e) {
			System.out.println("예외 발생");
		} // end of try-catch

	}// end of main

}// end of class
