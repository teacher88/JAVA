package thread10.Stack.Notify;

public class Producer extends Thread{
	private AutoMachine machine;					 // �����͸� ����(����)�ϴ� ������
	
	public Producer(AutoMachine machine){
		this.machine=machine;
	}
	
	public void run() {
		for(int i=1;i<=10;i++){
			machine.setDrink("����� NO" +  i);		
			System.out.println("����� NO" + i + "ä������");   					// Thread.currentThread().getName() 
			
			try {
					Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}
