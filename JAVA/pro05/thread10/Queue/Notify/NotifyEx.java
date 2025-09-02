package thread10.Queue.Notify;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  공유객체 및 데이타 : AutoMachin
 *                      생산자(저장), 소비자(읽기)
 */

public class NotifyEx {
	public static void main(String[] args) throws InterruptedException {
		AutoMachine machine=new AutoMachine();					// 자판기 기계
		
		Producer gildong=new Producer(machine);					    // 생산자
		
		Consumer cho=new Consumer(machine, "조인성");			// 소비자
		Consumer kim=new Consumer(machine, "김태희");
		Consumer park=new Consumer(machine, "박길동");
	
		gildong.start();
		Thread.sleep(5000);
		cho.start();
		Thread.sleep(5000);
		kim.start();
		Thread.sleep(5000);
		park.start();
		Thread.sleep(5000);
	}
}









