package ch02.quiz_control;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� �ǽ����� 10�� Ǯ��
 * 						���� 10) ����� ������ ��� �ϴ� ���α׷��� �ۼ��Ͻÿ�. ������ �Ⱓ�� ���� 
 *                                 �ٸ��ٰ� ���� �Ѵٸ�, 7�� 7.25%, 15�� 8.5%, 30�� 9.0%�̴�. (�Ҽ� ���ϴ� ó������ �ʴ´�.)
 */

public class Quiz10 {
	public static void main(String[] args) {			
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�Ⱓ�� �Է�:");
		int year=sc.nextInt();
		
		System.out.print("������Է�:");
		long money=sc.nextLong();
		
		int result=0;
		if(year==7){
			result=(int) (money*0.0725)/12;
		}else if(year==15){
			result=(int) (money*0.085)/12;
		}else if(year==30){
			result=(int) (money*0.09)/12;
		}
		
		System.out.println("�����:" + money + "\t" + "������:" + result);
		sc.close();
	}
}
