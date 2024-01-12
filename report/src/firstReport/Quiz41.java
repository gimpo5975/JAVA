package firstReport;

public class Quiz41 {

	public static void main(String[] args) {
		// 문6) 2~4단까지의 구구단 출력
		
		for(int k=1;k<=9;k++) {
			for(int i=2;i<=4;i++) {
				System.out.print(i+"X"+k+" = "+(i*k)+" ");
			}
			System.out.println();
		}
	}

}
