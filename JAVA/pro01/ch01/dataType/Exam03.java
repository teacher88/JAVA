package ch01.dataType;

/**
* @Data : 
* @Author : 강사
* @Description :  단항 연산자 :  ++/-- (전위형 연산자, 후위형 연산자)
*/

public class Exam03 {
	public static void main(String[] ar){
		int x=10;
		x++;
		++x;		
		System.out.println("x:" + x);
		System.out.println();
		 
		--x;
		x--;
		System.out.println("x:" + x);
		System.out.println();
		 
		int y=10;
		int z=++y;
		System.out.println("y:" + y);
		System.out.println("z:" + z);
		System.out.println();
		 
		int a=10;
		int b=20;
		int c=a++ + ++b;
		System.out.println("c:" + c);
		System.out.println();
		 
		int d=30;
		System.out.println("d:" + d++);	
		System.out.println("d:" + d);		
	}
}
