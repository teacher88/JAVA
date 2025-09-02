package thread04.Stop;


/**
 * @Data : 
 * @Author : ����
 * @Description :  ������ �����ϰ� ���� - Stop �÷���, interrupt()
 */

class PrintThread extends Thread{
	public boolean stop=false;    							 // �ʱ�ȭ false
	
	public void setStop(boolean stop){
		this.stop=stop;
	}
	
	@Override
	public void run() {
		while(!stop){		// true, false
			System.out.println("������......." + stop);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}

public class StopEx01 {
	public static void main(String[] args) {
		PrintThread print=new PrintThread();
		print.start();
		
		for(int i=0;i<=5;i++){
			
			// if(i==3) print.stop();    �����带 ���ڱ� �����ϰ� �Ǹ� ��� ���� �ڿ����� �Ҿ����� ���·� ��������.
		
			if(i==3)  {
				print.setStop(true);
				break;
			}	
			System.out.println(Thread.currentThread().getName() + "\t" + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}    
	
	}
}
