package ch02.quiz_control;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� �ǽ����� 13�� Ǯ��
 *						�ǽ����� 13) ������ �Է� �޾� �������� �ƴ����� �����ϴ� ���α׷��� �ۼ��� ����.
 *                                      ������ �Ϲ������� 4�⿡ �ѹ��� ���ƿ��µ� �� �� 100���� ������ �������� �ش�
 *                                      ������ �ƴϴ�. �׷��� 100���� ������ �������� �� �� 400���� ������ ��������
 *                                      �ش� �����̴�
 */

public class Quiz13 {
	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		int year=sc.nextInt();
		
		if((year%4)==0 && (year%100) !=0 || (year%400)==0){
			System.out.println(year + "�⵵�� �����Դϴ�.");
		}else{
			System.out.println(year + "�⵵�� ����Դϴ�.");
		}
		
		if((year%4)==0){
			if((year%100) !=0 || (year%400)==0){
				System.out.println(year + "�⵵�� �����Դϴ�.");
			}
		}else{
			System.out.println(year + "�⵵�� ����Դϴ�.");
		}
		sc.close();
	}
}
