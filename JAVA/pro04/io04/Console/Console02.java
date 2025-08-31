package io04.Console;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * @Data : 
 * @Author : 강사
 * @Description :      
 */

public class Console02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		System.out.print("문자 입력:");
		String str=sc.next();
		
		char ch=str.charAt(2);
		System.out.println("ch: " + ch);
		
		if(sc !=null) sc.close();
		
		PrintStream ps=System.out;
		ps.println("출력 연습입니다.");
		System.out.println("출력 연습니다.");
	}
}
