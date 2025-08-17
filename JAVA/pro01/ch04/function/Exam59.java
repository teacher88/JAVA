package ch04.function;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  지역(local),  static 변수
 */

public class Exam59 {
	public static int su=50;    
	
	public static void main(String[] ar){
		int x=10;
		int y=20;
		System.out.println("x:" + x );
		System.out.println("y:" + y );
		System.out.println("main su:" +  su + "\n");

		sub1(x);
		sub2(y);
	}
	
	public static void sub1(int value){
		int z=30;
		
		System.out.println("z:" + z);
		System.out.println("value:" +value );
		System.out.println("sub1 su:" +  su + "\n");
	}
	
	public static void sub2(int value){
		System.out.println("value:" + value); 
		System.out.println("sub2 su:" +  su);
		
		{
			int result=50;
			System.out.println("result:" + result);
		}
	}
}








