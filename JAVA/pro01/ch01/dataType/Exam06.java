package ch01.dataType;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� ������ : *, /, %, +, -
 */

public class Exam06 {
	public static void main(String[] ar){
		int x=10;
		int y=20;
		int sum=x+y;
		int cha=x-y;
		int mul=x*y;
		float div=(float)x/y;
		int rest=x%3;
		
		System.out.println("��:" + sum);
		System.out.println("��:" + cha);
		System.out.println("��:" + mul);
		System.out.println("������:" + div);
		System.out.println("������:" + rest);
		
		///////////////////////////////////////////////
		
		int a=1<<3;
		// 0000 0001
		//    0000 1000 : 8
		System.out.println("a:" + a);
		
		int b=8>>2;
		//	  0000 1000
		// 0000 0010 : 2
		System.out.println("b:" + b);
		
		int c=-10 >> 2;
		//    1111 0110
		// 1111 1101	: -3
		System.out.println("c:" + c);
		
		int d=-10 << 2;
		// 1111 0110
		//    1101 1000 : -40
		System.out.println("d:" + d);
		
		int i=8 >>> 2;
		//    0000 1000
		// 0000 0010	: 2 
		System.out.println("x:" + i);
		
		int j=-10 >>> 2;
		//    1111 0110
		// 1111 1101 : unsigned 1,073,741,821
		System.out.println("y:" + j);
	}
}
