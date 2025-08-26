package api05.Math;

/**
 * @Data :
 * @Author : ����
 * @Description :  Math Ŭ���� 
 */

public class ARoundEx {
	public static void main(String[] ar){		
		double x=123.5672; 
		double y=456.4672; 

		int a=(int) Math.round(x);
		System.out.println("�ݿø�:" + a);					// 124

		int b=(int) Math.ceil(y);
		System.out.println("������ �ø�:" + b);			   // 124
		
		int c=(int) Math.floor(x);
		System.out.println("������ ����:" + c);			    // 123
		System.out.println("\n");
		
		double temp=x*10;									// 1235.672
		int imsi=(int) Math.round(temp);					// 1236	
		double r=imsi/10.0;									// 123.6
		System.out.println("��°�ڸ� �ݿø�, ù°�ڸ� ���:" + temp + "\t" + imsi + "\t" + r);
		
		double o=Math.round(x*100)/100.0;
		System.out.println("��°�ڸ� �ݿø�, ��°�ڸ� ���:" + o);
		System.out.println("\n");
			
		double ce=Math.ceil(x*1000)/1000.0;
		System.out.println("��°�ڸ� �ø�, ��°�ڸ� ���:" + ce);	

		double f=Math.floor(x*100)/100.0;
		System.out.println("��°�ڸ� ����, ��°�ڸ� ���:" + f);
		System.out.println("\n");
		
		System.out.println("PI:" + Math.PI);	
		double pi=Math.floor(Math.PI *1000000)/1000000;
		System.out.println("�Ҽ�����¥�� ����:" + pi);
	}
}

