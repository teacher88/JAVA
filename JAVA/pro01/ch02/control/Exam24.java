package ch02.control;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  제어문 - 반복문 (for 문)
 */

public class Exam24 {
	public static void main(String[] ar){
		int dan=2;
		for(int i=1;i<=9;i++){
			System.out.println(dan + "*" + i + "=" + (dan *i));
		}
		System.out.println("\n");
		
		int hap=0;
		for(int i=1;i<=10;i++){
			hap=hap+i; 		
			System.out.print(i);
			
			if(i<=9){
				System.out.print("+");
			}else{
				System.out.println("=" + hap);
			}
		}
	}
}
