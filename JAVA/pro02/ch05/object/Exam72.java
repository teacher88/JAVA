package ch05.object;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  클래스 - 생성자
 */

class BirthdayB{
	private int year;
	private int month;
	private int day;
	private String name;
	private Scanner sc;
	
	public BirthdayB(){
		sc=new Scanner(System.in);
		
		System.out.print("이름:");
		name=sc.next();
		
		System.out.print("년도:");
		year=sc.nextInt();
		
		System.out.print("월:");
		month=sc.nextInt();
		
		System.out.print("일:");
		day=sc.nextInt();
		
		// sc.close();     error
	}
	
	public void disp(){
		System.out.println("name:" + name);
		System.out.println("month:" + month);
		System.out.println("day:" + day);
		System.out.println("year:" + year);
	}
	
	public void close(){
		if(sc != null) sc.close();
	}
}
 
public class Exam72 {
	public static void main(String[] ar){
		BirthdayB a=new BirthdayB();
		a.disp();
		
		BirthdayB b=new BirthdayB();
		b.disp();
		
		b.close();
	}
}

