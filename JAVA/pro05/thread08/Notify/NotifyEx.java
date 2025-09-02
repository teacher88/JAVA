package thread08.Notify;



/**
 * @Data : 
 * @Author : 강사
 * @Description :  wait()-notify()가 필요한 경우
 *                     공유 데이터로 두 개 이상의 스레드가 데이터를 주고 받을 때
 *                      
 * 						동기화 메소드
 *                        -wait() : 일시정지
 *						  -notify() : 실행대기
 **/

public class NotifyEx {
	public static void main(String[] args) {
		WorkObject workObject=new WorkObject();
		
		A a=new A(workObject);
		a.setName("a");
		A b=new A(workObject);
		b.setName("b");
		
		B c=new B(workObject);
		c.setName("c");
		B d=new B(workObject);
		d.setName("d");
		
		a.start();
		b.start();
		c.start();
		d.start();
	}
}
