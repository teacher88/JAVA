package ch07.interfaceA;

/**
 * @Data : 
 * @Author : ����
 * @Description :  interface
 *                     1. �ڹٿ��� �������̽��� ��ü ��� ����� ������ Ÿ���̴�.
 *                     2. �������� �����ϴ� �ſ� �߿��� ������ �Ѵ�.
 *                     3. �������̽��� ���������� public static final����� public abstract �Լ��� ����
 *                     4. ���������ڴ� public���� �� ���� ������������ �ۼ��� �� ����.
 *                     5. 8�������� default, static �޼ҵ� �߰� å 349~350
 */

interface XX{
	public int SU=20;	    	      // static final		
	public void disp();		 	 // abstract method
}
 
class YY implements XX{
	public void disp(){
		System.out.println("Hi");
	}
	
	public void output(){
		System.out.println("SU:" + SU);
		// SU=77;  error
	}
}

// interface Test extends XX { }
// interface Exam implements XX { }   �̷� ���� ����

public class Exam97 {
	public static void main(String[] ar){
		YY y=new YY();
		y.disp();
		y.output();
		System.out.println(YY.SU + "\n");
		
		XX x=new YY();
		x.disp();
		System.out.println(XX.SU);
	}
}
