package ch06.inheritance;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� - �ϳ��� ��ü�� �迭����
 */

public class MyCircle extends MyPoint {
	private int r;
	
	public void input(){
	    sc=new Scanner(System.in);
		
		System.out.print("x:");
		x=sc.nextInt();
		
		System.out.print("y:");
		y=sc.nextInt();
				
		System.out.print("r:");
		r=sc.nextInt();
	}
	
	public void output(){
		System.out.println(x + "\t" + y + "\t" + r);
	}
}

