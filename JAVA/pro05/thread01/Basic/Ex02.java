package thread01.Basic;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  Thread
 */

import java.awt.Toolkit;

class BeepTask extends Thread{
	
	@Override
	public void run() {
		Toolkit toolkit=Toolkit.getDefaultToolkit();

		for(int i=0;i<5;i++){
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class PrintSub extends Thread{
	
	@Override
	public void run() {
		
		for(int i=0;i<5;i++){
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Ex02 {
	public static void main(String[] args) throws InterruptedException {
/*		프로그램 순서 흐름에 있어 순서대로 호출된다.		

  		Toolkit toolkit=Toolkit.getDefaultToolkit();
  		
  		for(int i=0;i<5;i++){
			System.out.println("띵");       
		} 
  		
  		for(int i=0;i<5;i++){
			toolkit.beep();
		} 
		
		  // 띵이 출력된 후 소리가 출력된다.
	
*/
		 
		PrintSub p=new PrintSub();
		p.start();
		
		BeepTask bt=new BeepTask();
		bt.start();
	}
}
