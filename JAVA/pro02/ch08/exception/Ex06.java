package ch08.exception;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  예외 처리 - 다중 catch
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
			System.out.println("0으로 나눌수없습니다.");
		}catch(InputMismatchException e){
			System.out.println("정수만 입력 하실 수 있습니다.");
		}
		
		sc.close();
	}
}



