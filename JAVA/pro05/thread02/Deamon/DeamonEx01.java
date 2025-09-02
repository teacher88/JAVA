package thread02.Deamon;

/**
 * @Data : 
 * @Author : 강사
 * @Description : DaemonThread : 주 스레드가 종료 되면 데몬 스레드는 강제적으로 자동 종료 (디폴드 독립 스레드)
 * 					   예) 워드프로세서의 자동저장, 미디어 플레이어의 동영상 및 음악 재상, 가비지 컬렉터
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
				System.out.println("시스템 깨어나지 못함:" + e);
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
				System.out.println("시스템 깨어나지 못함:" + e);
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
		alpha.setName("알파벳 쓰레드");
		alpha.start();			// start() 함수전에 setDaemon()함수를 호출 해야함
		
		Digit03 digit=new Digit03();
		digit.setDaemon(true);
		digit.setName("디지털 쓰레드");
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
