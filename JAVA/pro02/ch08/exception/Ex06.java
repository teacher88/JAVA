package ch08.exception;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ���� ó�� - ���� catch
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex06 {
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);
		
		try{
			System.out.print("x:");
			int x=sc.nextInt();
			
			System.out.print("y:");
			int y=sc.nextInt();
			
			int div=x/y;
			System.out.println("div:" + div);
			
		}catch(ArithmeticException e){
			System.out.println("0���� �����������ϴ�.");
		}catch(InputMismatchException e){
			System.out.println("������ �Է� �Ͻ� �� �ֽ��ϴ�.");
		}
		
		sc.close();
	}
}



