package ch02.control;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  제어문 - 반복문 (for 문)
 */

public class Exam23 {
	public static void main(String[] ar){
		for(int i=0;i<10;i++){
			if(i%2==0)
				System.out.println("i=" + i);
		}
		System.out.println();
		
		int hap=0;
		for(int i=1;i<=10;i++){
			hap=hap+i; 		
		}
		System.out.println("hap:" + hap);
		
		int sum=0;
		for(int i=100;i<=200;i++){
			if(i>150 && i <200)
				sum+=i;		
		}
		System.out.println("sum:" + sum);
	}
}





