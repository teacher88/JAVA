package thread01.Basic;

/**
 * @Data :
 * @Author : °­»ç
 * @Description :  Thread - Runnable
 */

class AA{
	public void disp(){
		System.out.println("hahaha");
	}
}
 
class Alphabet02 extends AA implements Runnable{
	
	@Override
	public void run(){  		
		super.disp();
		
		for(char i='A';i<='Z';i++){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}

class Digit02 extends Thread{
	
	@Override
	public void run(){		
		for(int i=1;i<=10;i++){
			System.out.println(i);		
			try {
				super.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Ex04 {
	public static void main(String[] ar){		
		Alphabet02 alpha=new Alphabet02();
		Thread th=new Thread(alpha);
		th.start();
		
		Digit02 digit=new Digit02();
		digit.start();
	}
}






