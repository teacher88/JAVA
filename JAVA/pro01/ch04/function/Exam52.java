package ch04.function;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  함수 - Call by Value
 */

public class Exam52 {
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("name:");
		String name=sc.next();
		
		System.out.print("kor:");
		int kor=sc.nextInt();
		
		System.out.print("eng:");
		int eng=sc.nextInt();
		
		System.out.print("mat:");
		int mat=sc.nextInt();
		
		System.out.println("name:" + name);
		
		total(kor, eng, mat);
		average(kor, eng, mat);
		
		sc.close();
	}
	
	public static void total(int kor, int eng, int mat){
		int tot=kor + eng + mat;
		System.out.println("tot:" + tot);
	}
	
	public static void average(int kor, int eng, int mat){
		float avg=(float)(kor + eng + mat)/3;
		System.out.println("avg:" + avg);
	}
}



























