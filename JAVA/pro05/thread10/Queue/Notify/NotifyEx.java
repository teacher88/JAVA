package thread10.Queue.Notify;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ������ü �� ����Ÿ : AutoMachin
 *                      ������(����), �Һ���(�б�)
 */

public class NotifyEx {
	public static void main(String[] args) throws InterruptedException {
		AutoMachine machine=new AutoMachine();					// ���Ǳ� ���
		
		Producer gildong=new Producer(machine);					    // ������
		
		Consumer cho=new Consumer(machine, "���μ�");			// �Һ���
		Consumer kim=new Consumer(machine, "������");
		Consumer park=new Consumer(machine, "�ڱ浿");
	
		gildong.start();
		Thread.sleep(5000);
		cho.start();
		Thread.sleep(5000);
		kim.start();
		Thread.sleep(5000);
		park.start();
		Thread.sleep(5000);
	}
}









