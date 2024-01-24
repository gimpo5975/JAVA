package polymorphism.animal;

public class AnimalMain {

	public static void main(String[] args) {

//		Animal animal = new Animal();
//		Cat cat = new Cat("치즈냥", 1);
//		Dog dog = new Dog("누렁이", 3);
//		Bird bird = new Bird("수리수리독수리", 3);
//
//		animal.cry();
//		cat.cry();
//		dog.cry();
//		bird.cry();
		
		
		//********************************************************************
		
		//배열은 같은 타입의 자료를 저장하는 공간
		Animal[] aniArry = {//자식은 부모타입에 담을 수 있다. 부모는 자식 타입에 담을 수 없다.
			new Animal(),
			new Cat("치즈냥", 1),
			new Dog("누렁이", 3),
			new Bird("수리수리독수리", 3)
		};
		
		//출력하기
		for(int i=0; i<aniArry.length; i++) {
			aniArry[i].cry();
		}//end of for
		
		//향상된 for문으로 출력하기
		for(Animal ani : aniArry) {
			ani.cry();
		}//end of for
		
	}// end of main

}// end of class
