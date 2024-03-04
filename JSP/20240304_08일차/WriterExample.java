package fileInputOutput;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample {
	public static void main(String[] args) throws Exception {

		String w = "c:\\temp\\test10.txt";
		// 파일 내보내기, 문자기반 파일 출력 스트림
		Writer writer = new FileWriter(w);// 문자기반 파일 출력 스트림 생성

		// 출력할 문자열
		String str = "ABC";
		writer.write(str);// 문자열 전체를 출력

		writer.flush();// 출력 버퍼에 잔류하는 모든 문자열을 출력
		writer.close();// 출력 스트림 닫기

		String w1 = "C:\\temp\\test11.txt";
		Writer writer2 = new FileWriter(w1);
		String str2 = "java is fun";

		writer2.write(str2);

		writer2.flush();// 출력 버퍼에 잔류하는 모든 문자열을 출력
		writer2.close();// 출력 스트림 닫기

	}// end of main
}// end of class
