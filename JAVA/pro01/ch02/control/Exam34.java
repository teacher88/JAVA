package ch02.control;

import java.io.IOException;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  표준 입출력
 */

public class Exam34 {
	public static void main(String[] ar)throws IOException{
		System.out.print("문자를 입력해주세요:");
		int a=System.in.read();
		System.out.println("a:" + a);
		
		System.out.print("문자를 입력해주세요:");
		char x=(char)System.in.read();
		System.out.println("x:" + x);
		System.in.read();
		System.in.read();
		System.out.println();
				
		System.out.print("문자를 입력해주세요:");
		char y=(char)System.in.read();
		System.in.read();	
		System.in.read();	
		System.out.println("y:" + y);
		System.out.println();
				
		System.out.print("문자를 입력해주세요:");
		char z=(char)System.in.read();
		System.out.println("z:" + z);		
	}
}
