package thread02.Deamon;

/**
 * @Data : 
 * @Author : ����
 * @Description : DaemonThread : �� �����尡 ���� �Ǹ� ���� ������� ���������� �ڵ� ���� (������ ���� ������)
 * 					   ��) �������μ����� �ڵ�����, �̵�� �÷��̾��� ������ �� ���� ���, ������ �÷���
 */

class Alphabet03 extends Thread{
	
	@Override
	public void run(){
		System.out.println("\n\n" + super.getName());
		
		char i='A';
		while(i<='Z'){
			System.out.print(i);			
			try{
					super.sleep(500);
			}catch(InterruptedException e){
				System.out.println("�ý��� ����� ����:" + e);
			}
			i++;
		}		
	}
}

class Digit03 extends Thread{
	
	@Override
	public void run(){
		System.out.println("\n\n" + super.getName());
		
		int i=1;
		while(i<=50){
			System.out.print(i);		
			try{
				super.sleep(500);
			}catch(InterruptedException e){
				System.out.println("�ý��� ����� ����:" + e);
			}			
			if(i%10==0)System.out.println();
			i++;			
		}
	}
}

public class DeamonEx01 {
	public static void main(String[] ar){
		Alphabet03 alpha=new Alphabet03();
		alpha.setDaemon(true);
		alpha.setName("���ĺ� ������");
		alpha.start();			// start() �Լ����� setDaemon()�Լ��� ȣ�� �ؾ���
		
		Digit03 digit=new Digit03();
		digit.setDaemon(true);
		digit.setName("������ ������");
		digit.start();		
		
		System.out.println("main start!!");	
		for(int i=65;i<=70;i++){
			System.out.print("*");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main end!!");
	}
}
