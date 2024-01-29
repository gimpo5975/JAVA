package exam.bank;

import java.util.ArrayList;

public class ArrayListExam {
	public static void main(String[] args) {
		// 문자열을 저장할 ArrayList 생성
		ArrayList<String> names = new ArrayList<>();

		// ArrayList에 요소 추가
		names.add("김원중");
		names.add("김투중");
		names.add("김쓰리중");

		// 인덱스를 이용하여 ArrayList의 요소에 접근
		System.out.println("인덱스 0에 있는 요소: " + names.get(0));

		// 향상된 for 루프를 사용하여 ArrayList를 반복
		System.out.println("ArrayList의 요소들:");
		for (String name : names) {
			System.out.println(name);
		}

		// ArrayList에 특정 요소가 있는지 확인
		String searchName = "김투중";
		if (names.contains(searchName)) {
			System.out.println(searchName + "은(는) ArrayList에 있습니다.");
		} else {
			System.out.println(searchName + "은(는) ArrayList에 없습니다.");
		}

		// ArrayList에서 요소 제거
		names.remove("김투중");
		System.out.println("김투중을 제거한 후:");
		for (String name : names) {
			System.out.println(name);
		}

		// ArrayList의 크기 확인
		System.out.println("ArrayList의 크기: " + names.size());

		// ArrayList의 모든 요소 제거
		names.clear();
		System.out.println("ArrayList의 모든 요소를 제거한 후 크기: " + names.size());
	}// end of main
}// end of class