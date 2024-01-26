package interfaceExam.bookExam;

public class SmartTelevisiomExam {
	public static void main(String[] args) {

		RemoteControl rc = new SmartTelevision();
		Searchable sc = new SmartTelevision();

		sc.search("www.naver.com");
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(7);
		
	}// end of main
}// end of class
