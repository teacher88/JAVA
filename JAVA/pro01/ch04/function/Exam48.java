package ch04.function;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �Լ� - Call by Name
 */

public class Exam48 {
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�����ϳ��� �Է����ּ���.(1~3):");
		int x=sc.nextInt();
		if(x==1)		
			aa();
		else if(x==2)
			bb();
		else if(x==3)
			cc();
		System.out.println("end!");
		
		sc.close();
	}
	
	public static void aa(){
		System.out.println("AA() Function");
	}
	
	public static void bb(){
		System.out.println("BB() Function");
	}
	
	public static void cc(){
		System.out.println("CC() Function");
	}
}



