package exam1_interface;

import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {
		// 몇개의 도형을 그리고 싶은가
		// 선택한 도형에 해당하는 객체 생성

		// #1. Scanner 객체 생성
		Scanner sc = new Scanner(System.in);

		// #2. 지역 변수 초기화
		int num = 0;// 그림을 그릴 도형의 개수
		Shape[] shape = null;// 입력받은 도형 객체를 저장할 배열
								// 몇개의 도형을 그릴 것인지 묻고 그 도형의 개수만큼 공간을 확보
								// 각 도형의 객체를 생성해서 저장
		// #3.그릴 도형의 개수입력 받기
		System.out.print("그림을 그릴 도형의 개수 입력 >> ");
		num = Integer.parseInt(sc.nextLine());

		// #4. 입력받은 개수 만큼의 도형을 저장할 공간 설정
		shape = new Shape[num]; // 자식이 부모에 담기게 된다

		for (int i = 0; i < shape.length; i++) {
			// #5. 그리려는 도형을 선택하기
			int selectType = 0;
			do {// 조건의 참 거짓과 관계없이 반드시 한번은 실행한다
				System.out.println("------------------------");
				System.out.println((i + 1) + ") 그리려는 도형 선택");
				System.out.println("[1]점 | [2]수평선 | [3]수직선 | [4]사각형");
				System.out.println("------------------------");
				System.out.print("번호 선택 >> ");
				selectType = Integer.parseInt(sc.nextLine());

			} while (selectType < 1 || selectType > 4);

			// #6. 도형을 배열에 저장
			switch (selectType) {
			case 1:
				shape[i] = new Point("점");
				break;

			case 2:
			case 3:
				System.out.print("선의 길이 입력 >> ");
				int length = Integer.parseInt(sc.nextLine());

				// 삼항 연산자를 사용해서 수평선, 수직선인지 구분
				shape[i] = (selectType == 2) ? new HorizonLine("수평선", length) : new VerticalLine("수직선", length);
				break;

			case 4:
				System.out.print("사각형의 가로 길이 입력 >> ");
				int width = Integer.parseInt(sc.nextLine());
				System.out.print("사각형의 세로 길이 입력 >> ");
				int height = Integer.parseInt(sc.nextLine());

				shape[i] = new Rectangle("사각형", width, height);
				break;
			}// end of switch

		} // end of for

		System.out.println();
		System.out.println("============================================");
		System.out.println();

		// 도형 그리기
		for (Shape s : shape) {
			s.printDraw();
		} // end of for-each

		sc.close(); // 스캐너 리소스 닫기, 아래부터 Scanner 객체 사용불가

	}// end of main

}// end of class
