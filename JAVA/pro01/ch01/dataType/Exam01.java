package ch01.dataType;

/**
 * @Data : 
 * @Author : 강사
 * @Description : 자료형 
 */
public class Exam01 {
	public static void main(String[] ar){		
		System.out.print("Hello java");
		System.out.println("How are you");
		System.out.println("Hi");
		System.out.println();
		
		System.out.println("정수형(기본) 자료형");
		byte a=10;															// 1byte (-128~127)
		short b=128;														// 2byte (-32768~32767)
		int c=1000;															// 4byte (-2147483648~2147483647)
		long d=6580L;														// 8byte (-2^63~2^63-1)
		System.out.println("a:" + a + "\t" + "b:" + b); 
		System.out.println("c:" + c + "\t" + "d:" + d);
		System.out.println();
		
		System.out.println("실수형 자료형");
		float e=45.4f;														// 4byte(1.4E-45~3.4082E38)
		double f=120.40;													// 8byte(4.92E-324~1.8E308)
		System.out.println("e:" + e  + "\t" + "f:" + f);
		System.out.println();
		
		System.out.println("문자형 자료형");
		char x='A';															// 2byte				
		char y='김';
		System.out.println("x:" + x + "\t" + "y:" + y);
		System.out.println();
		
		System.out.println("문자열(객체) 자료형");
		String str1="Hello java";											// 무한 참조형
		String str2="How are you";
		String str3="Hi";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println();
		
		System.out.println("논리형");
		boolean b1=true;													// 1bit true(1), false(0)
		boolean b2=false;	
		System.out.println(b1);
		System.out.println(b2);
		
		char ch=65;
		if(ch>64) System.out.println(ch);
	}
}
