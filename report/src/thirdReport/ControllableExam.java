package thirdReport;

public class ControllableExam {

	public static void main(String[] args) {

		Controllable tv = new Tv();
		RemoteControll tv2 = new Tv();
		Controllable notebook = new NoteBook();
		Controllable computer = new Computer();

		Controllable[] caArr = { tv, notebook, computer };

		for (Controllable caArray : caArr) {
			System.out.println("**********");
			caArray.turnOn();
			caArray.turnOff();
			caArray.repair();
			Controllable.reset();
			System.out.println();

			if (tv instanceof Tv tv3) {
				tv3.setVolume(100);
			} // end of if
		} // end of for

		tv2.setVolume(5);

	}// end of main

}// end of class
