package thread01.Basic;

/**
 * @Data : 
 * @Author : ����
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
			System.out.println("��");
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
/*		���α׷� ���� �帧�� �־� ������� ȣ��ȴ�.		

  		Toolkit toolkit=Toolkit.getDefaultToolkit();
  		
  		for(int i=0;i<5;i++){
			System.out.println("��");       
		} 
  		
  		for(int i=0;i<5;i++){
			toolkit.beep();
		} 
		
		  // ���� ��µ� �� �Ҹ��� ��µȴ�.
	
*/
		 
		PrintSub p=new PrintSub();
		p.start();
		
		BeepTask bt=new BeepTask();
		bt.start();
	}
}
