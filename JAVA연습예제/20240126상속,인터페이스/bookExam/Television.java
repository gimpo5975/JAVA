package interfaceExam.bookExam;

// 			  자식클래스 	implements 	부모인터페이스
public class Television implements RemoteControl {

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}// end of turnOn()

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}// end of turnOff()

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLIME) {
			this.volume = RemoteControl.MIN_VOLIME;
		}else {
			this.volume = volume;
		}//end of if
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}// end of setVolume()

}// end of class
