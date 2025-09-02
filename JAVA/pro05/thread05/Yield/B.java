package thread05.Yield;

public class B extends Thread{
	public boolean stop=false;
	public boolean work=true;
	
	@Override
	public void run() {
		while(!stop){													// stop�� true�� �Ǹ� while�� ����
			if(work){
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("ThreadB �۾�����");		
			}else{
				Thread.yield();										// work�� false�� �Ǹ� �ٸ� �����忡�� ���� �纸
			}
		}
		
		System.out.println("ThreadB ����");
	}
}
