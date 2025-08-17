package ch01.dataType;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  삼항 연산자 : 조건식 ? 참:거짓
 *                     대입 연산자 : =, *=, /=, %=, +=.=, -=, <<=, >>=, >>>=, &=, ^=, !=
 *                     순차(컴마) 연산자 : ,
 */

public class Exam09 {
	public static void main(String[] ar){
		int a=10;
		System.out.println(a==10 ? "True" : "False");
		
		int b=20;
		int c=30;
		int d=b!=c ? b: c;
		System.out.println("d:" + d);
		System.out.println();
	
		int i=100;
		System.out.println(i+=2);   // 102
		System.out.println(i-=2);   // 100
		System.out.println(i*=2);   // 200
		System.out.println(i/=2);   // 100
		System.out.println(i);
	
		int x=10, y=20, z=30;
		System.out.println("x:" + x + "\t" + "y" + y + "\t" + "z" + z);
		
		// -----------------------------------------
		
		int su=10;
		int value=20;
		System.out.println(su);
		System.out.println("su:" + su);
		System.out.println("su:" + su + "\t value:" + value);
		
		System.out.println(su +"" + value);
		System.out.println("결과" + (su + value));
	}
}





