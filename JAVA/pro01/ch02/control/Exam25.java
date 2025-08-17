package ch02.control;

/**
 * @Data :
 * @Author : 강사
 * @Description :  제어문 - 반복문 (다중 for 문)
 */

public class Exam25 {
	public static void main(String[] ar){
		for(int i=1;i<=3;i++){
			for(int j=1;j<=5;j++){
				System.out.println("i:" + i + "\t" + "j=" + j);
			}
			System.out.println();
		}
		System.out.println();
		
		for(char i='A';i<='Z';i++){		
			for(char j=i;j<='Z';j++){  
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		char ch='A';
		System.out.println(++ch);
		System.out.println();
		
		for(char i='A';i<='z';i++){
			System.out.print(i + ":" + ((byte) i) + "\t");
			
			if(i=='Z'){
				System.out.println();
			}
		}
	}
}







