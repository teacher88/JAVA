package ch08.exception;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  예외 처리 - 멀티 catch 은 1.7버전
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
			System.out.println("에러 발생.");
		}
		
		sc.close();
	}
}
