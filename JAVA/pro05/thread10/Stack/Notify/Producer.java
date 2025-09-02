package thread10.Stack.Notify;

public class Producer extends Thread{
	private AutoMachine machine;					 // 데이터를 생산(저장)하는 스레드
	
	public Producer(AutoMachine machine){
		this.machine=machine;
	}
	
	public void run() {
		for(int i=1;i<=10;i++){
			machine.setDrink("음료수 NO" +  i);		
			System.out.println("음료수 NO" + i + "채워넣음");   					// Thread.currentThread().getName() 
			
			try {
					Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}
