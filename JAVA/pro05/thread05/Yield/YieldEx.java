package thread05.Yield;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ȣ���� ������� ���� ��� ���·� ���ư��� ������ �켱���� �Ǵ� ���� �켱������ ����
 *                     �ٸ� �����尡 ���� ��ȸ�� ���� �� �ֵ��� ���ݴϴ�.
 *                     
 */

public class YieldEx {
	public static void main(String[] args) throws InterruptedException {
		A a=new A();
		B b=new B();
		
		a.start();
		b.start();						// A, B ��� ����
		Thread.sleep(3000);
		
		a.work=false;				// B�� ����
		Thread.sleep(3000);
		
		a.work=true;				     // A ����
		b.work=false;	             // A�� ����			
		Thread.sleep(3000);
		
		a.stop=true;			 		 // ����
		b.stop=true;
	}
}
