                                             package thread03.Join;


/**
 * @date  :
 * @name : ����
 * @description :  join �Լ� - �ٸ� �������� ���Ḧ ��ٸ�	
 */

public class JoinEx {
	public static void main(String[] args) {
		SumThread sum=new SumThread(); 
		sum.start();
		
		try {
			sum.join();    												// SumThread�� ������ �� ���� ���� �����带 �Ͻ� ������Ŵ
		} catch (InterruptedException e) {
			e.printStackTrace();
		}			

		for(int i=0;i<100;i++) {
			System.out.print(i + "\t");
			
			if(i%10==0) System.out.println();
		}
	}
}



