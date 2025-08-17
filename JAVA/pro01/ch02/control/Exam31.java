package ch02.control;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  제어문 - break, continue
 */

public class Exam31 {
	public static void main(String[] ar){
		for(int i=0;i<3;i++){
			for(int j=0;j<5;j++){
				if(j==3)		
				    continue;
				System.out.println(i + "\t" + j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>>>");
		System.out.println();
		 
		AA: for(int i=0;i<3;i++){
			System.out.println();
			for(int j=0;j<5;j++){
				if(j==3)		
				    // continue AA; 
					break AA;
				System.out.println(i + "\t" + j);
			}
		}
		System.out.println();
	}
}






