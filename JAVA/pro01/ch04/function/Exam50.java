package ch04.function;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  함수 - Call by Value
 */

public class Exam50 {
	public static void main(String[] ar){
		sub(2, 5);
		System.out.println("hahaha");
		System.out.println();
		
		sub(3,3);
		System.out.println("hohoho");
		System.out.println();
		
		sub(2,10);
		System.out.println("end!!");
		System.out.println();
	}
	
	public static void sub(int x, int y){
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


