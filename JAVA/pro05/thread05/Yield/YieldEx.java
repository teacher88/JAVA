package thread05.Yield;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  호출한 스레드는 실행 대기 상태로 돌아가고 동일한 우선순위 또는 높은 우선순위를 갖는
 *                     다른 스레드가 실행 기회를 가질 수 있도록 해줍니다.
 *                     
 */

public class YieldEx {
	public static void main(String[] args) throws InterruptedException {
		A a=new A();
		B b=new B();
		
		a.start();
		b.start();						// A, B 모두 실행
		Thread.sleep(3000);
		
		a.work=false;				// B만 실행
		Thread.sleep(3000);
		
		a.work=true;				     // A 해제
		b.work=false;	             // A만 실행			
		Thread.sleep(3000);
		
		a.stop=true;			 		 // 종료
		b.stop=true;
	}
}
