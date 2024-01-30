package exam.score;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Score {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// #1. 학생수 입력받아 배열 공간 확보
		System.out.print("학생수를 입력 >> ");
		int studentNum = Integer.parseInt(sc.nextLine());

		// 배열공간 확보
		// 이름과 학과 배열공간 설정
		String[][] name = new String[studentNum][2];// 이름과 학과 받기 위해, 행은 학생수 만큼 열은 두개

		// DB,SW,PG 점수 입력할 공간 확보
		int[][] scores = new int[studentNum][3];// 행은 학생수, 열은 과목점수

		// 개별 합계, 평균, 학점, 석차 담을 공간 확보
		int[] sum = new int[studentNum];
		double[] avg = new double[studentNum];
		String[] grade = new String[studentNum];
		int[] rank = new int[studentNum];

		// 이름과 학과를 한번에 받아서 처리
		for (int i = 0; i < name.length; i++) {
			System.out.println("이름과 학과 순서대로 입력 >>");
			for (int k = 0; k < name[i].length; k++) {
				// 이름과 학과 name[i][0], 학과는 name[i][1]
				name[i][k] = sc.nextLine();
				// 확인용
//				System.out.println(name[i][k] + "="+name[i][k]);
			} // end of for in
		} // end of for
		System.out.println();

		// 성적 입력받아서 처리
		System.out.println("성적입력 >> ");
		for (int i = 0; i < scores.length; i++) {
			// 개인별로 합계와 평균고 석차를 처리
			int personalSum = 0;
			double personalAvg = 0.0;
			rank[i] = 1;
			for (int k = 0; k < scores[i].length; k++) {
				// scores[i][0] : DB, scores[i][1] : SW, scores[i][2] : PG
				scores[i][k] = Integer.parseInt(sc.nextLine());
				// 개별합계
				personalSum += scores[i][k];
			} // end of for in
			System.out.println("--------");
			// 개별 평균
			personalAvg = (double) personalSum / scores[i].length;

			sum[i] = personalSum;
			avg[i] = personalAvg;

			// 학점 구하기
			if (avg[i] >= 90) {
				grade[i] = "A";
			} else if (avg[i] >= 80) {
				grade[i] = "B";
			} else if (avg[i] >= 70) {
				grade[i] = "C";
			} else if (avg[i] >= 60) {
				grade[i] = "D";
			} else {
				grade[i] = "F";
			} // end of if

		} // end of for

		// 석차 구하기
		for (int i = 0; i < avg.length; i++) {
			for (int k = 0; k < avg.length; k++) {
				// 석차비교
				if (avg[i] < avg[k]) {
					rank[i] += 1;
				} // end of if

			} // end of for in
		} // end of for

		// 전체화면 출력
		System.out.println(
				"=================================================================================================");
		System.out.println("번호\t이름\t학과\tDB\tSW\tPG\t합계\t평균\t학점\t석차");
		System.out.println(
				"=================================================================================================");
		// 학생 수 만큼 출력
		for (int i = 0; i < studentNum; i++) {
			DecimalFormat df = new DecimalFormat("#.##");
			// 번호: i+1;
			System.out.print((i + 1) + "\t");

			// 이름과 학과 => 두 과목을 같은이름의 배열에 담음
			for (int k = 0; k < name[i].length; k++) {
				System.out.print(name[i][k] + "\t");
			} // end of for in

			// 과목별 성적 => 3과목을 하나의 배열에 담음
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			} // end of for in

			// 합계, 평균, 학점, 석차
			System.out.print(sum[i] + "\t" + df.format(avg[i]) + "\t" + grade[i] + "\t" + rank[i]);
			System.out.println();
		} // end of for

		System.out.println("-----------------------");
		System.out.print("개인성적을 보고 싶은 학생의 번호 입력 >> ");
		int no = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < studentNum; i++) {
			DecimalFormat df = new DecimalFormat("#.##");
			if ((i + 1) == no) {// 학생 번호는 i+1로 잡음, no와 같은지 체크
				// 개인 성적표 출력
				System.out.println("***" + name[i][0] + "***");// name[i][0] => 이름, name[i][1] => 학과
				System.out.println(
						"=================================================================================================");
				System.out.println("번호\t이름\t학과\tDB\tSW\tPG\t합계\t평균\t학점\t석차");
				System.out.println(
						"=================================================================================================");
				// 번호
				System.out.print((i + 1) + "\t");

				// 이름과 학과 => 두 과목을 같은이름의 배열에 담음
				for (int k = 0; k < name[i].length; k++) {
					System.out.print(name[i][k] + "\t");
				} // end of for in

				// 과목별 성적 => 3과목을 하나의 배열에 담음
				for (int j = 0; j < scores[i].length; j++) {
					System.out.print(scores[i][j] + "\t");
				} // end of for in

				// 합계, 평균, 학점, 석차
				System.out.print(sum[i] + "\t" + df.format(avg[i]) + "\t" + grade[i] + "\t" + rank[i]);
				System.out.println();

				// 해당 학생의 자료를 출력했으면 반복문 빠져나가기
				break; // 개인 성적 출력이라서

			} // end of if
		} // end of for

	}// end of main

}// end of class
