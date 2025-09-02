package thread05.Yield;

public class B extends Thread{
	public boolean stop=false;
	public boolean work=true;
	
	@Override
	public void run() {
		while(!stop){													// stop이 true가 되면 while문 종료
			if(work){
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("ThreadB 작업내용");		
			}else{
				Thread.yield();										// work가 false가 되면 다른 스레드에게 실행 양보
			}
		}
		
		System.out.println("ThreadB 종료");
	}
}
