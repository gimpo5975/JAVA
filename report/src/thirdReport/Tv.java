package thirdReport;

public class Tv implements Controllable, RemoteControll {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV을 켠다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV을 끈다");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
//			최댓값 보다 크면 최댓값으로 구현
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLIME) {
			this.volume = RemoteControl.MIN_VOLIME;
		} else {
			this.volume = volume;
		} // end of if
		System.out.println("현재 Tv 볼륨 : " + this.volume);
	}// end of setVolume()

}// end of class
