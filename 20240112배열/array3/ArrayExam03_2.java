package array3;

public class ArrayExam03_2 {

	public static void main(String[] args) {

		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;//합계
		int count = 0;//공간의 개수
		double avg = 0.0;//평균
		
		for(int i =0; i<array.length; i++) {
			for(int k=0; k<array[i].length; k++) {
				sum+=array[i][k];
				count++;
			}//end of for in
		}//end of for out

		avg = (double)sum / count;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
				
	}//end of main

}//end of class
