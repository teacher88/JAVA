package ch08.exception;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ���� ó�� - ��Ƽ catch �� 1.7����
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex08 {
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);
		
		try{
			System.out.print("x:");
			int x=sc.nextInt();
			
			System.out.print("y:");
			int y=sc.nextInt();
			
			int div=x/y;
			System.out.println("div:" + div);
			
		}catch(ArithmeticException  | InputMismatchException e){
			System.out.println("���� �߻�.");
		}
		
		sc.close();
	}
}
