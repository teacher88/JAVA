package thread06.Synchronized;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ����ȭ ���, ����ȭ �޼ҵ�, ���ǿ���
 */

public class Ex {
	public static void main(String[] args) {
		Calculator calculator=new Calculator();		// ������ü
		
		User1 user1=new User1();
		user1.setCalculator(calculator);		
		user1.start();
		
		User2 user2=new User2();
		user2.setCalculator(calculator);
		user2.start();
	}
}
