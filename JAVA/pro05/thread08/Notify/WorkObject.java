package thread08.Notify;

public class WorkObject {			// 공유객체
	public synchronized void methodA(){
		System.out.println(Thread.currentThread().getName() + ": WorkObject - methodA() 작업실행");
		
		notify();							// 다른 스레드를 깨움
		
		try {
			wait();							// 자기 자신은 일시정지
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void methodB(){
		System.out.println(Thread.currentThread().getName()  + ": WorkObject - methodB() 작업실행");
		
		notify();                      // 다른 스레드를 깨움
		
		try {
			wait();                   // 자기 자신은 일시정지
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


