package ch01.dataType;

 /**
 * @Data : 
 * @Author : ����
 * @Description :  ���� ������ : !, ~, +/-
 */

public class Exam02 {
	public static void main(String[] ar){
		boolean a=false;
		boolean b=!a;
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println();
		
		int c=~10;
		// 0000 1010 : 10
		// 1111 0101 : -11     �ϳ� ū��
		System.out.println("c:" + c);
		
		int d=~-15;
		// 1111 0001 : -15
		// 0000 1110 : 14		�ϳ� ������
		System.out.println("d:" + d);
		System.out.println();
       
		int x=100;
		int y=-200;
		System.out.println( x + "\t" + y);				// 100, -200
		System.out.println(-x + "\t" + -y);				// -100, 200
		System.out.println( x + "\t" + y);		        // ���������� ���� ���ش�.
	}
}







