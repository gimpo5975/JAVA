package firstReport;

public class Quiz39 {

	public static void main(String[] args) {
		/*
		 * 문4) 1~ 100까지의 홀수의 합과 짝수의 합, 3의 배수의 합 for문과 if문 활용
		 */

		int hSum=0, jSum=0, mSum=0;
		for(int i=0;i<=100;i++) {
			if(i %2==1) {
				hSum+=i;
			}else if(i%2==0) {
				jSum+=i;
		}
			if(i%3==0) {
				mSum+=i;
			}
		}	
		System.out.println("짝수" + jSum);
		System.out.println("홀수" + hSum);
		System.out.println("3의 배수" + mSum);
	}//end of main

}
