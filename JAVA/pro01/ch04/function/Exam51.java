package ch04.function;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �Լ� - Call by Value
 */

public class Exam51 {
	public static void main(String[] ar){
		input();
	}
	
	public static void input(){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ���:");
		String name=sc.next();
		
		System.out.print("�ֹι�ȣ �Է��ϼ���:");
		String juminbunho=sc.next();
		
		System.out.print("�ּҸ� �Է��ϼ���:");
		String address=sc.next();
		
		output(name, juminbunho, address);
		sc.close();
	}
 
	public static void output(String n, String j, String a){
		System.out.println("�̸�:" + n);
		System.out.println("�ֹι�ȣ:" + j);
		System.out.println("�ּ�:" + a);
	}
}

