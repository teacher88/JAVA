package ch02.control;

/**
 * @Data :
 * @Author : ����
 * @Description :  ��� - ���ǹ� (if ~ else��)
 */

public class Exam12 {
	public static void main(String[] ar){
		int a=-25;
		
		if(a>0)
			System.out.println("����Դϴ�.");
		else
			System.out.println("�����Դϴ�.");
		
		if(a%2==0){
			a+=100;
			System.out.println("¦���Դϴ�." + a);
		}else{
			a*=200;
			System.out.println("Ȧ���Դϴ�." + a);
		}
		
		// ���׽� ǥ��
		String str=a>0 ? "���":"����";
		System.out.println(str);
	}
}
