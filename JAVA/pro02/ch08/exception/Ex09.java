package ch08.exception;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  예외 만들기 - throw
 */

import java.util.Scanner;

public class Ex09 {							
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);		
		
		try{
			System.out.print("수를 입력하세요:");
			int b=sc.nextInt();
			
			if(b==10){
				NumberFormatException ex=new NumberFormatException("사용자가 10를 입력했습니다.");
				throw ex; 
			}
			
		}catch(Exception e){
			System.out.println("10를 입력하셨습니다. \n");
			System.out.println(e.getMessage());
		}finally{
			if(sc!=null) sc.close();
		}
	}
}



