package ch03.quiz;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �迭 �ǽ����� 10��
 * 					    ���� 10) '��', '��', 'ȭ', '��', '��', '��', '��' �� �ʱ�ȭ�� ���ڿ� �迭 day�� �����ϰ� ����ڷκ���
 *                                 ������ �Է¹޾� 7(�迭 day ũ��)�� ���� �������� ���ؽ��� �Ͽ� �迭 day�� ����� ���ڸ� ����϶�.
 */

public class Quiz10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] day=new char[] {'��', '��', 'ȭ', '��', '��', '��', '��'};
	
		System.out.print("������ �Է��ϼ��� >> ");
		int su=sc.nextInt();
		
		for(int i=0;i<day.length;i++){
			System.out.println(su%day.length);
			if(su%day.length==i){   		// 15%7=1, 26%7=5
				System.out.println(day[i]);
			}
		}
		sc.close();
	}
}
