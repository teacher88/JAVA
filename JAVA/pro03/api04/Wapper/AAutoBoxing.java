package api04.Wapper;

/**
 * @Data : 
 * @Author : ����
 * @Description :  Wrapper Ŭ���� - �⺻ Ÿ��(byte, char, short, int, long, float, double, boolean) ���� �����ϴ� ��ü
 *                                               �ڵ� Boxing, UnBoxing
 */

public class AAutoBoxing {
	public static void main(String[] args) {
		
		// �ڵ� Boxing
		Integer obj=100;
		System.out.println("obj:" + obj);
		
		// ���Խ� �ڵ�  UnBoxing
		int value=obj;
		System.out.println("value:" + value);
		
		//  ����� �ڵ� UnBoxing
		int result=obj+100;						// ��Ȯ�� �������� �������� �ڵ��ڽ̿� ���� �����ϴ�.
		System.out.println("result:" + ++result);
	}
}
