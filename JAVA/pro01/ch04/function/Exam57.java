package ch04.function;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  함수중복 - Function Overload(Overloading)
 */

public class Exam57 {
	public static void main(String[] ar){			
		sub("홍길동");			
		sub(10);
		sub(24.5f);
		sub(10, 40);
		sub('A');
	}
	
	public static void sub(String name){
		System.out.println("name:" + name);
	}
	
	public static void sub(int x){
		System.out.println("x:" + x);
	}
	
	public static void sub(float y){
		System.out.println("y:" + y);
	}
	
	public static void sub(int a, int b){
		System.out.println("a:" + a + "\t" + "b:" + b);
	}
	
	public static void sub(char c){
		System.out.println("c:" +  c);
	}
}




