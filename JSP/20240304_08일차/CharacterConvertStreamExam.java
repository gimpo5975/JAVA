package fileInputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExam {
	public static void main(String[] args) throws Exception {

		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);

	}// end of main

	public static void write(String str) throws Exception {

		String o = "c:\\temp\\test2.txt";
		FileOutputStream fos = new FileOutputStream(o);
		Writer writer = new OutputStreamWriter(fos);// 보조 스트림을 연결

		// OutoutStreamWriter 보조 스트림을 이용해서 문자 출력
		writer.write(str);
		writer.flush();
		// 리소스 닫기
		writer.close();

	}// end of write

	public static String read() throws Exception {

		String f = "c:\\temp\\test2.txt";
		FileInputStream fis = new FileInputStream(f);
		Reader reader = new InputStreamReader(fis);

		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);

		reader.close();
		String data = new String(buffer, 0, readCharNum);//char 배열에서 읽은 수만큼 문자열로 변환
		return data;

	}// end of read
}// end of class
