package firstReport;

public class Quiz44 {

	public static void main(String[] args) {
		//문44) 1 ~ 10까지의 홀수의 합만 구하기

		int sum=0;
		for(int i=1; i<=10;i++) {
			if(i%2==0) {
				continue;
			}
			sum+=i;
		}
		System.out.println(sum);
		
	}

}
