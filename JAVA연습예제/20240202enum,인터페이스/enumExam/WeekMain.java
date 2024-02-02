package enumExam;

import java.util.Calendar;

class WeekMain {

	// end of entry point
	public static void main(String[] args) {
		Week w = null;
		Week[] week = { w.MONDAY, w.TUESDAY, w.WEDNESDAY, w.THURSDAY, w.FRIDAY, w.SATURDAY, w.SUNDAY };

		for (Week we : week) {
			System.out.print(we + "__");
		} // end of for-each
		System.out.println();

		System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖");
		Week today = null;
		Calendar cal = Calendar.getInstance();
		int week2 = cal.get(Calendar.DAY_OF_WEEK);

		switch (week2) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}// end of switch

		System.out.println("오늘은 " + today + "입니다.");

		if (today == Week.FRIDAY) {
			System.out.println("1주일 자료를 정리합니다.");
		} else {
			System.out.println("자바 진도를 나갑니다.");
		} // end of if

	}// end of main

}// end of class
