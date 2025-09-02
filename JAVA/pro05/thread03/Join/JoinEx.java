                                             package thread03.Join;


/**
 * @date  :
 * @name : 강사
 * @description :  join 함수 - 다른 스레드의 종료를 기다림	
 */

public class JoinEx {
	public static void main(String[] args) {
		SumThread sum=new SumThread(); 
		sum.start();
		
		try {
			sum.join();    												// SumThread가 종료할 때 까지 메인 스레드를 일시 정지시킴
		} catch (InterruptedException e) {
			e.printStackTrace();
		}			

		for(int i=0;i<100;i++) {
			System.out.print(i + "\t");
			
			if(i%10==0) System.out.println();
		}
	}
}



