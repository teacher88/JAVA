package ch04.function;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  함수 - Call by Value ~ Return
 */

public class Exam53 {
	public static void main(String[] ar){
		int a=sub1();
		System.out.println("a:" + a);
		
		float b=sub2();
		System.out.println("b:" + b);
		
		String c=sub3();
		System.out.println("c:" + c);
		
		int d=sub4(10, 20);
		System.out.println("d:" + d);
	}
	
	public static int sub1(){
		int x=10;
		return x;
	}
	
	public static float sub2(){
		float y=24.4f;
		return y;
	}
	
	public static String sub3(){
		return "hi";
	}
	
	public static int sub4(int i, int j){
		int k=i+j;
		return k;
	}
}




