package thread04.Stop;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �����带 �����ϰ� ���� 
 *                     - ���� �ٿ�ε�, ��뷮 ����ó�� ���� �ɸ��� �۾��� �ߴ��ؾ� �Ҷ� 
*/

class SubThread extends Thread{

	@Override
	public void run() {
		int count=1;
		
		while(count <= 10){
			System.out.println("������------" + count);
				
			try {
				if(interrupted()) break;    // ���������� true
				
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// e.printStackTrace();
				System.out.println("sleep �� ���ͷ�Ʈ �߻�, ������ ����");
	            break;
			}

			++count;
			
			System.out.println("�ڿ� ����");
			System.out.println("���� ���� \n");
		}
	}
}

public class InterrupEx02 {
	public static void main(String[] args) {
		SubThread subThread=new SubThread();
		subThread.start();
		
		for(int i=0;i<=2;i++) {
			System.out.println("main:" + i);
			
			if(i==1) subThread.interrupt();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}
}



