package ch02.quiz_control;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description : ��� �ǽ����� 5�� Ǯ��
 *                    ���� 5) �����Կ� Ű�� �Է� �޾� �� ����� ���̾�Ʈ�� �ʿ������� �����ϴ� ���α׷��� �ۼ��ϼ���.
 *                             (��, ������>(Ű-100)*0.9 �̸� ���̾�Ʈ�� �ʿ��� ������ �Ѵ�.) (if��)
 */

public class Quiz05 {
	public static void main(String[] args){		
		Scanner sc=new Scanner(System.in);
		System.out.print("Ű�� �Է��ϼ���:");
		float ki=sc.nextFloat();
		
		System.out.print("�����Ը� �Է��ϼ���:");
		float w=sc.nextFloat();
		
		if(w > (ki-100)*0.9)
			System.out.println("����� ���̾�Ʈ�� �ʿ��մϴ�.");
		else 
			System.out.println("����� ���̾�Ʈ�� �ʿ����� �ʽ��ϴ�.");
		
		sc.close();
	}
}
