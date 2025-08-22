package ch06.inheritance;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  상속 - 하나의 객체로 배열관리
 */

public class MyRect extends MyPoint{
	private int w, h;
	
	public void input(){
		sc=new Scanner(System.in);
		
		System.out.print("x:");
		x=sc.nextInt();
		
		System.out.print("y:");
		y=sc.nextInt();
		
		System.out.print("w:");
		w=sc.nextInt();
		
		System.out.print("h:");
		h=sc.nextInt();
	}
 
	public void output(){
		System.out.println(x + "\t" + y + "\t" + w + "\t" + h);
	}
}








