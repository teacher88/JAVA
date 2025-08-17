package ch01.dataType;

/**
* @Data : 
* @Author : 강사
* @Description :  단항 연산자 : (cast) 또는 (자료형)
*/

public class Exam04 {
	public static void main(String[] ar){
		byte a=10;
		short b=a;
		System.out.println("b:" + b);
				
		short c=20;
		byte d=(byte)c;
		System.out.println("d:" + d);
		
		int x=100;
		long y=x; 
		int z=(int)y;
		System.out.println("z:" + z);
		
		float i=24.5f;
		double j=i;
		float k=(float)j;
		System.out.println("k:" + k);
		
		int su1=10;
		float su2=24.5f;
		float su3=su1+su2;
		System.out.println("su3:" + su3);
		
		int  su4=su1+ (int) su2;
		System.out.println("su4:" + su4);
				
		
		int value=10;
		float result=(float) value/3;   		// value/ (float) 3
		System.out.println("result:" + result);
	}
}
