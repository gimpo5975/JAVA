package fileInputOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) {

		try {
			OutputStream os = new FileOutputStream("c:\\temp\\test1.txt");
			byte a = 10;
			byte b = 20;
			byte c = 30;

			byte[] array = { 40, 50, 60 };

			os.write(a);// 1byte씩 출력
			os.write(b);
			os.write(c);

			os.write(array);

			os.flush();// 버퍼 내용 모두 출력하기(버퍼 비우기)
			os.close();// 출력 스트림을 닫기

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} // end of try-catch 

	}// end of main
}// end of class
