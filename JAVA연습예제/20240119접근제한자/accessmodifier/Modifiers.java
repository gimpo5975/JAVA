package accessmodifier;

public class Modifiers {
	private String priName = "보안";
	private int priAge = 50;

	String defName = "기본";
	int defAge = 70;

	public String pubName = "공용";
	public int pubAge = 100;

	
	public void showInfo() {
		System.out.println("priName : " + priName);
		System.out.println("priAge : " + priAge);
		System.out.println();
		System.out.println("defName : " + defName);
		System.out.println("defAge : " + defAge);
		System.out.println();
		System.out.println("pubName : " + pubName);
		System.out.println("pubAge : " + pubAge);
	}//end of showInfo()
	
}// end of class
