package genericExam;

public class GenericMethod {
	// 제네릭 메소드
	// [접근제한자] static <제네릭타입> 반환타입 메소드명(매개변수)
	public static <T> void showArrayContent(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		} // end of for
		System.out.println();
	}// end of showArrayContent

	// 매개변수 값으로 넘겨 받은 배열의 마지막 요소를 리턴
	// 접근제한자 static <제네릭타입> 반환타입 메소드명(매개변수타입 매개변수){}
	public static <T> T getLastElement(T[] lastArr) {
		return lastArr[lastArr.length - 1];// 길이 -1 : 마지막 요소
	}// end of getLastElement

	public static void main(String[] args) {

		Integer[] inArr = { 10, 20, 30, 40 };
		Character[] chArr = { 'J', 'A', 'V', 'A', ' ', 'H', 'E', 'L', 'L', 'O' };
		String[] strArr = { "낭만", "인정", "여행" };

		// 1) 메소드를 호출해서 배열의 내용을 확인
		// 메소드를 호출할 때 구체적인 타입을 생략 => 컴파일러가 매개값을 가지고 타입을 설정
		showArrayContent(inArr);
		showArrayContent(chArr);
		showArrayContent(strArr);

		System.out.println(getLastElement(inArr));// 구체적인 타입을 생략하면 컴파일러가 매개값을 가지고 타입을 설정
		System.out.println(getLastElement(chArr));
		System.out.println(getLastElement(strArr));

		// 2) 메소드 호출시 구체적인 타입을 명시
		GenericMethod.<Integer>showArrayContent(inArr);
		GenericMethod.<Character>showArrayContent(chArr);
		GenericMethod.<String>showArrayContent(strArr);

		System.out.println(getLastElement(inArr));
		System.out.println(getLastElement(chArr));
		System.out.println(getLastElement(strArr));

	}// end of main

}// end of class
