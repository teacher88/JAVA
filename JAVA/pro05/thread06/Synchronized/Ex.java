package thread06.Synchronized;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  동기화 블록, 동기화 메소드, 임의영계
 */

public class Ex {
	public static void main(String[] args) {
		Calculator calculator=new Calculator();		// 공유객체
		
		User1 user1=new User1();
		user1.setCalculator(calculator);		
		user1.start();
		
		User2 user2=new User2();
		user2.setCalculator(calculator);
		user2.start();
	}
}
