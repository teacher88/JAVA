package ch04.quiz;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �Լ� �ǽ����� 15
 *                     ���� 15) �Լ��� �̿��Ͽ� ���ڸ� �Է��� ��ŭ ���� ����ϴ� ���α׷��� �ۼ��ϼ���. (Call By Value)
 */

public class Quiz15 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("�� ���� �Է��ϼ���:");
		int num=sc.nextInt();
		
		subStart(num);
		
		sc.close();
	}
	
	public static void subStart(int num){
		for(int i=1;i<=num;i++){
			System.out.print("*");
		}
	}
}
