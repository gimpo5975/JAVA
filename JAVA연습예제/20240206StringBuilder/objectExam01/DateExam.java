package objectExam01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {

		Date now = new Date();//현재 날짜 출력 메소드
		
		String strNow = now.toString();
		System.out.println(strNow);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		
		System.out.println(sdf.format(now));
	}//end of main

}//end of class
