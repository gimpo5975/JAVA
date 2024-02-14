package threadexam5;

public class DishThreadMain {

	// entry point
	public static void main(String[] args) {

		final Dish d = new Dish();

		new Thread(new Cook(d)).start();
		new Thread(new Customer(d)).start();

		
	}// end of main

}// end of class
