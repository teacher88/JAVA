package thread01.Basic;

/**
 * @Data : 
 * @Author : ����
 * @Description :  Thread
 */

import javax.swing.JOptionPane;

class SubThread extends Thread{
	public static boolean inputCheck=false;	
	
	@Override
	public void run(){
		for(int i=10;i>0;i--){
			System.out.println(i);			
			if(SubThread.inputCheck) return ;
			
			try {
				super.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}		
		System.out.println("10�� �ȿ� ���� �Էµ��� �ʾ� �����մϴ�.");
		System.exit(0);
	}
}

class InputThread extends Thread{
	
	@Override
	public void run(){
		String input=JOptionPane.showInputDialog("10�ʾȿ� �� �Է��ϼ���:");
		if(input !=null) SubThread.inputCheck=true;
		System.out.println("�Է��Ͻ� ����:" + input + "�Դϴ�.");
	}
}

public class Ex03 {
	public static void main(String[] args){	
 /*      ���α׷� ���� �帧�� �־� ������� ȣ��ȴ�.		
		
		String input=JOptionPane.showInputDialog("10�ʾȿ� �� �Է��ϼ���:");
		if(input !=null) System.out.println("�Է��Ͻ� ����:" + input + "�Դϴ�.");
		
		for(int i=10;i>0;i--){
			System.out.println(i);					
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}		
		System.out.println("10�� �ȿ� ���� �Էµ��� �ʾ� �����մϴ�."); 
*/

		
		InputThread i=new InputThread();
		i.start();

		SubThread s=new SubThread();
		s.start();		
	}
}
