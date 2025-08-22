package ch08.exception;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  예외 처리 - ArithmeticException 
 */

public class Ex01 {							
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("x:");
		int x=sc.nextInt();
		
		System.out.print("y:");
		int y=sc.nextInt();
			
		try{
			int div=x/y;                   // float 에러 발생
			System.out.println("나눗셈:" +  div);
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌수없습니다.");
		}
		
		sc.close();
	}
}
