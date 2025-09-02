package thread10.Queue.Notify;

public class Consumer extends Thread{				// �����͸� �Һ�(�д�)�ϴ� ������
	private AutoMachine machine;	
	private String name;
	
	public Consumer(AutoMachine machine, String name){
		this.machine=machine;
		this.name=name;
	}	
	
	public void run() {
		for(int i=1;i<=10;i++){
			System.out.println(machine.getDrink() + ":" + name + "���� ����");			
			
			try {
				 Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
