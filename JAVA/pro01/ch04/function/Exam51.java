package ch04.function;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  함수 - Call by Value
 */

public class Exam51 {
	public static void main(String[] ar){
		input();
	}
	
	public static void input(){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("이름을 입력하세요:");
		String name=sc.next();
		
		System.out.print("주민번호 입력하세요:");
		String juminbunho=sc.next();
		
		System.out.print("주소를 입력하세요:");
		String address=sc.next();
		
		output(name, juminbunho, address);
		sc.close();
	}
 
	public static void output(String n, String j, String a){
		System.out.println("이름:" + n);
		System.out.println("주민번호:" + j);
		System.out.println("주소:" + a);
	}
}

