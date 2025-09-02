package thread04.Stop;


/**
 * @Data : 
 * @Author : 강사
 * @Description :  쓰레드 안전하게 종료 - Stop 플래그, interrupt()
 */

class PrintThread extends Thread{
	public boolean stop=false;    							 // 초기화 false
	
	public void setStop(boolean stop){
		this.stop=stop;
	}
	
	@Override
	public void run() {
		while(!stop){		// true, false
			System.out.println("실행중......." + stop);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}

public class StopEx01 {
	public static void main(String[] args) {
		PrintThread print=new PrintThread();
		print.start();
		
		for(int i=0;i<=5;i++){
			
			// if(i==3) print.stop();    스레드를 갑자기 종료하게 되면 사용 중인 자원들이 불안전한 상태로 남겨진다.
		
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
