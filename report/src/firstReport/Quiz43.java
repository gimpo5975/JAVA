package firstReport;

public class Quiz43 {

	public static void main(String[] args) {
		// 문43) 주사위 2개를 5번 던져 나오는 눈을 출력하시오.
		
		for(int i=1; i<=5;i++) {
			int a = (int)(Math.random()*6)+1;
			int b = (int)(Math.random()*6)+1;
			
			System.out.println(a+","+b);
		}
		
	}

}
