package ch04.quiz;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �Լ� �ǽ����� 18
 *                     ���� 18) � �� �� ���� �Է� �޾� max �Լ��� �����ϰ� ȣ���ϼ���. 
 *                                max �Լ��� �� ���� ���� �� �ִ밪�� ã�� �Լ� �Դϴ�. (Call By Value)
 */

public class Quiz18 {
	public static void main(String[] agrs){	
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է��ϼ���:");
		int x=sc.nextInt();
		
		System.out.print("���� �Է��ϼ���:");
		int y=sc.nextInt();
		
		max(x, y);
		
		sc.close();
	}
	
	public static void max(int x, int y){
		if(x > y)
			System.out.println(x + "�� Ů�ϴ�.");
		else 
			System.out.println(y + "�� Ů�ϴ�.");
	}
}










