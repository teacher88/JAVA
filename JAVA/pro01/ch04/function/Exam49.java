package ch04.function;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  함수 - Call by Value
 */

public class Exam49 {
	public static void main(String[] ar){
		sub1(10);
		sub2(20);
		System.out.println("good!");
		sub2(5);
		System.out.println("end!");
	}
	
	public static void sub1(int x){
		System.out.println("x=" + x);
	}
	
	public static void sub2(int y){
		for(int i=0;i<y;i++){
			System.out.println("hahaha");
		}
	}
}

