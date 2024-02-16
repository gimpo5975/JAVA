package collectionexam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackDishMain {
	// entry point
	public static void main(String[] args) {

		// Dish 객체를 담을 Stack 컬렉션 생성
		Stack<Dish> dish = new Stack<>();

		// 접시 쌓기 - push(넣기), pop(꺼내기),peek() 가장 위의 내용 확인
		// 가장 나중에 저장된 데이터가 가장 먼저 꺼내진다. (Last in First Out, LIFO)
		dish.push(new Dish(1));
		dish.push(new Dish(2));
		dish.push(new Dish(3));
		dish.push(new Dish(4));
		dish.push(new Dish(5));

		System.out.println(" **** Stack ***** ");
		// 접시 꺼내기 - pop, 가장 마지막에 저장한 것을 먼저 꺼냄, LIFO
		while (!dish.isEmpty()) { // dish.empty();, 비어 있지 않으면 꺼내기
			System.out.println("현재 가장 위에 있는 접시 살펴보기: " + dish.peek().getValue());
			System.out.println("---------------------------------------");

			Dish dishObject = dish.pop();
			System.out.println("현재 가장 위에 있는 접시 꺼내오기 : " + dishObject.getValue());
			// System.out.println(dish.pop().getValue());
			System.out.println("========================================");
			System.out.println();
		} // end of while

		System.out.println();
		System.out.println(" **** Queue ***** ");
		Queue<Dish> dishQueue = new LinkedList<>(); // Queue는 인터페이스

		// 접시 쌓기 - offer() 저장, poll() 꺼내기, peek() 확인, FIFO
		// 가장 먼저 들어간 데이터부터 가장 먼저 꺼낸다.(First in First Out)

		dishQueue.offer(new Dish(1));
		dishQueue.offer(new Dish(2));
		dishQueue.offer(new Dish(3));
		dishQueue.offer(new Dish(4));
		dishQueue.offer(new Dish(5));

		// 접시 꺼내오기
		while (!dishQueue.isEmpty()) {
			System.out.println("현재 가장 앞에 있는 접시 살펴보기: " + dishQueue.peek().getValue());
			System.out.println("---------------------------------------");

			Dish dishQueueObject = dishQueue.poll();
			System.out.println("현재 가장 앞에 있는 접시 꺼내오기 : " + dishQueueObject.getValue());
			System.out.println("========================================");
			System.out.println();
		} // end of while

	}// end of main

}// end of class