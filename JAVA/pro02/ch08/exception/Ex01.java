package ch08.exception;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ���� ó�� - ArithmeticException 
 */

public class Ex01 {							
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("x:");
		int x=sc.nextInt();
		
		System.out.print("y:");
		int y=sc.nextInt();
			
		try{
			int div=x/y;                   // float ���� �߻�
			System.out.println("������:" +  div);
		}catch(ArithmeticException e){
			System.out.println("0���� �����������ϴ�.");
		}
		
		sc.close();
	}
}
