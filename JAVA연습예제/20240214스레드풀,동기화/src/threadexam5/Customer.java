package threadexam5;

public class Customer implements Runnable {

	// #field
	private final Dish dish; // final variable

	// #constructor
	public Customer(Dish dish) {
		this.dish = dish; // initialize
	}// end of constructor

	// (int i) : kind of dish
	private void eat(int i) throws InterruptedException {

		// 공유 자원을 동기화 블록 - 요리사와 고객이 음식을 공유하기 때문에 동기화 시킴
		synchronized (dish) {// synchronization block
			while (dish.isEmpty()) {// 빈 접시면
				dish.wait();// 기다려라
			}
			
			// 빈 접시가 아니면 음식을 먹음
			dish.setEmpty(true);
			System.out.println(i + "번째 음식을 먹었습니다.");

			dish.notify();// wait()으로 인해 일시정지 상태인 경우 실행 대기 상태로 만들기

		} // end of synchronized

	}// end of cooking

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {//5가지 요리를 차례로 요리한다.
			try {
				eat(i);
				Thread.sleep(300);
			} catch (InterruptedException e) {
				System.out.println("Exception occurred");
			} // end of try-catch
		} // end of for
	}// end of run

}// end of class
