package array3;

public class Memo {

	public static void main(String[] args) {
//		String str1 = new String("홍길동");
//		String str2 = "홍길동";
//		String str3 = "홍길동";
//		String str4 = new String("홍길동");
//
//		System.out.println(str1 == str2); // false => 주소값을 비교하기 때문에
//		System.out.println(str2 == str3); // true => 주소값을 비교하기 때문에
//		System.out.println(str1.equals("홍길동"));// true
//		System.out.println(str2.equals("김자바"));// false
//		System.out.println(str1.equals(str2));// true => 주소가 가리키는 곳의 값이 같은지 비교
//		System.out.println("*********************************************");
		
//		str2 += "님 즐거운 시간입니다잇";// 기존 객체는 버리고 새로운 객체를 생성한 다음 값을 저장
		
		String str1 = "king";
		String str2 = "원중";
		String str3 = str2.concat(str1);
		String str5 = "Hi wonjjung";
		System.out.println(str5.length());//10
		System.out.println(str5.charAt(1));// i출력 인덱스 0번부터 시작함
		System.out.println(str5.indexOf("j"));//6번 출력 인덱스 0번부터 시작함
		System.out.println(str5.lastIndexOf("j"));//6번 출력 인덱스 0번부터 시작함
		System.out.println(str3);
		
	}// end of main

}// end of class
