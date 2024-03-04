package fileInputOutput;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {
	public static void main(String[] args) throws Exception {

		String r = "c:\\temp\\test10.txt";

		Reader reader = new FileReader(r);

		while (true) {
			int data = reader.read();// 한 문자씩 읽기
			if (data == -1) {
				break;
			} // end of if
			System.out.println((char) data);//문자로 명시적 형변환
		} // end of while

		reader.close();//입력 스트림 닫기

	}// end of main
}// end of class
