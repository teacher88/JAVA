package ch02.control;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� - ���ǹ� (if��)
 */

public class Exam10 {
	public static void main(String[] ar){
		int x=20;
		if(x>10)			// ������ ������ �ϳ� �ۿ� ���ٸ� �߰�ȣ ��������, �������� ���� �������ϴ°� ����
			System.out.println("10���� ū���Դϴ�.");
		System.out.println();
		
		int y=110;
		if(y>0 && y<100){
			y+=200;
			System.out.println("y:" + y);
		}
	}
}
