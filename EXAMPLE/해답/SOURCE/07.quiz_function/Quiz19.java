package ch04.quiz;

import java.util.Scanner;

/**
 * @Data :
 * @Author : ����
 * @Description :  �Լ� �ǽ����� 19
 *                     ���� 19) � �� �� ���� �Է� �޾� ��ȯ�ϴ� �Լ� �����Ѵ�. 
 *                                swap �Լ��� �� ���� ���� �Ű������� ���������ν� ȣ��ȴ�. (Call By Value)
 */

public class Quiz19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���:");
		int a=sc.nextInt();
		
		System.out.print("���� �Է��ϼ���:");
		int b=sc.nextInt();
		
		swap(a, b);
		
		sc.close();
	}
	
	public static void swap(int a, int b){
		System.out.println("���簪\t\t" + "a:" + a + "\t" + "b:" + b);
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("��ȯ�Ȱ�\t" + "a:" + a + "\t" + "b:" + b);
	}
}
