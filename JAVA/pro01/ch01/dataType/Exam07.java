package ch01.dataType;

/**
* @Data : 
* @Author : 강사
* @Description :  비교 연산자 : <, >, <=, >=, ==, !=
*/

public class Exam07 {
	public static void main(String[] ar){
		int a=10;
		int b=20;
		
		boolean c=a>b;
		boolean d=a<b;
		boolean e=a>=b;
		boolean f=a<=b;
		System.out.println("c:" + c);
		System.out.println("d:" + d);
		System.out.println("e:" + e);
		System.out.println("f:" + f);
		System.out.println();
		
		int x=100;
		int y=200;
		boolean z=x==y;
		boolean zz=x!=y;
		System.out.println("z:" + z);
		System.out.println("zz:" + zz);
	}
}
