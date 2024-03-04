package fileInputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExam {

	public static void main(String[] args) {

		try {
			InputStream is = new FileInputStream("c:\\temp\\test1.txt");

			byte[] array = new byte[100];
			while (true) {

				int readByteNum = is.read(array); //배열 길이 만큼 읽기
				
				if (readByteNum == -1) {// 더이상 읽어올 자료가 없으면 -1을 리턴
					break;
				} // end of if
				
				for(int arr : array) {
					System.out.println(arr);
				}//end of for

			} // end of while
			is.close();// 입력 스트림 닫기
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} // end of try-catch

	}// end of main
}// end of class
