package ch04.function;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  지역(local),  static 변수
 */

public class Exam60 {
	public static int count=0;

	public static void main(String[] ar){
		sub(10);
		sub(20);
		sub(30);
	}
	
	public static void sub(int x){
		System.out.println("x:" + x);
		System.out.println("count:" + ++count);
	}
}

