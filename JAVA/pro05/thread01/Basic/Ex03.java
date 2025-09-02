package thread01.Basic;

/**
 * @Data : 
 * @Author : 강사
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
		System.out.println("10초 안에 값이 입력되지 않아 종료합니다.");
		System.exit(0);
	}
}

class InputThread extends Thread{
	
	@Override
	public void run(){
		String input=JOptionPane.showInputDialog("10초안에 값 입력하세요:");
		if(input !=null) SubThread.inputCheck=true;
		System.out.println("입력하신 값은:" + input + "입니다.");
	}
}

public class Ex03 {
	public static void main(String[] args){	
 /*      프로그램 순서 흐름에 있어 순서대로 호출된다.		
		
		String input=JOptionPane.showInputDialog("10초안에 값 입력하세요:");
		if(input !=null) System.out.println("입력하신 값은:" + input + "입니다.");
		
		for(int i=10;i>0;i--){
			System.out.println(i);					
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}		
		System.out.println("10초 안에 값이 입력되지 않아 종료합니다."); 
*/

		
		InputThread i=new InputThread();
		i.start();

		SubThread s=new SubThread();
		s.start();		
	}
}
