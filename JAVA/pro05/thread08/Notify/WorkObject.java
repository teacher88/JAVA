package thread08.Notify;

public class WorkObject {			// ������ü
	public synchronized void methodA(){
		System.out.println(Thread.currentThread().getName() + ": WorkObject - methodA() �۾�����");
		
		notify();							// �ٸ� �����带 ����
		
		try {
			wait();							// �ڱ� �ڽ��� �Ͻ�����
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void methodB(){
		System.out.println(Thread.currentThread().getName()  + ": WorkObject - methodB() �۾�����");
		
		notify();                      // �ٸ� �����带 ����
		
		try {
			wait();                   // �ڱ� �ڽ��� �Ͻ�����
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


