package io04.Console;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :      
 */

public class Console02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		System.out.print("���� �Է�:");
		String str=sc.next();
		
		char ch=str.charAt(2);
		System.out.println("ch: " + ch);
		
		if(sc !=null) sc.close();
		
		PrintStream ps=System.out;
		ps.println("��� �����Դϴ�.");
		System.out.println("��� �����ϴ�.");
	}
}
