package ch02.quiz_control;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description : ��� �ǽ����� 2�� Ǯ��
 *                    ���� 2) � ���� �Է��ؼ� �� ���� 10���� ũ�� 20���� ������ ����ϴ� ���α׷��� 
 *								�ۼ��ϼ���. (if��)
 */

public class Quiz02 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("�����Է��ϼ���:");
		int su=sc.nextInt();
		
		if(su > 10 && su <20){
			System.out.println("su:" + su);
		}
			
		sc.close();
	}
}
