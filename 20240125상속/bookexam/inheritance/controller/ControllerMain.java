package bookexam.inheritance.controller;

public class ControllerMain {

	public static void main(String[] args) {
		Controller controller = new Controller();

		controller.setService(new MemberService());
		controller.service.login();

		controller.setService(new Aservice());
		controller.service.login();

	}// end of main

}// end of class
