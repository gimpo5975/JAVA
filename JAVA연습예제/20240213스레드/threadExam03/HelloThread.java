package threadExam03;

public class HelloThread extends Thread {

	@Override
	public void run() {
		String[] hello = {"hello","hello","hello","hello","hello"};
		
		for(int i=0; i<hello.length;i++) {
			System.out.println(hello[i]+"\t");

			try {
				Thread.sleep(500);// 0.5초 단위로 멈춤
			} catch (InterruptedException e) {
				System.out.println("예외가 발생하였습니다.");
			} // end of try/catch
		}//end of for
	
	
	}//end of run

}//end of class
