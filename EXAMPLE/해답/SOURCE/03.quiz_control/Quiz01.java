package ch02.quiz_control;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description : ��� �ǽ����� 1�� Ǯ��
 *                    ���� 1)  ���� �ϳ��� �Է� �޾� �� ���� 1�̸� ��������, 2�̸� �������� �̶�� ���ڸ� ����ϴ� 
 *								���α׷��� �ۼ��ϼ���. (switch ~ case��)
 */

public class Quiz01 {
	public static void main(String[] args){	
		Scanner sc=new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		int su=sc.nextInt();
		
		if(su==1){
			System.out.println("����");
		}else if(su==2){
			System.out.println("����");
		}	
		
		sc.close();
	}
}
