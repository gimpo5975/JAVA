package com.bankexamfirst.BankExamFirst;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class BankTransactionAnalyzerSimple {

	private static final String RESOURCES = "src/main/java/";

	public static void main(String[] args) throws IOException {

		// 경로
		final Path path = Paths.get(RESOURCES + "bankexam01.txt");
		// 파일의 모든 줄을 읽어 저장
		final List<String> lines = Files.readAllLines(path);

		double total = 0;
		// 날짜 패턴
		final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		// lines 내용을 ,를 기준으로 나누기
		for (final String line : lines) {
			// ,로 구분해서 저장, 열을 분리
			final String[] columns = line.split(",");

			// 날짜 형식, 파싱
			final LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN);

			if (date.getMonth() == Month.FEBRUARY) {
				final double amount = Double.parseDouble(columns[1]);
				total += amount;
			} // end of if

		} // end of for
		System.out.println("모든 거래의 합계 : " + total);
	}// end of main

}// end of class
