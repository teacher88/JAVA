package ch01.dataType;

/**
 * @Data : 
 * @Author : 강사
 * @Description : 논리 연산자 : &, ^, |, &&, || 
 */

public class Exam08 {
	public static void main(String[] ar){
		byte a=10;
		byte b=2;
		// 0000 1010
		// 0000 0010
		System.out.println("a & b:" + (a&b));    // 0000 0010  2
		System.out.println("a | b:" + (a|b));  	  // 0000 1010  10
		System.out.println("a ^ b:" + (a^b));  	  // 0000 1000   8
		System.out.println();
		
		int x=15;
		boolean y=x>10 && x<20;
		boolean z=x==10 || x==15;
		System.out.println("x && y:" + y);
		System.out.println("x || y:" + z);
	}
}
