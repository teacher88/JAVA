package thread04.Stop;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  스레드를 안전하게 종료 
 *                     - 파일 다운로드, 대용량 연산처럼 오래 걸리는 작업을 중단해야 할때 
*/

class SubThread extends Thread{

	@Override
	public void run() {
		int count=1;
		
		while(count <= 10){
			System.out.println("실행중------" + count);
				
			try {
				if(interrupted()) break;    // 내부적으로 true
				
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// e.printStackTrace();
				System.out.println("sleep 중 인터럽트 발생, 스레드 종료");
	            break;
			}

			++count;
			
			System.out.println("자원 정리");
			System.out.println("실행 종료 \n");
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



