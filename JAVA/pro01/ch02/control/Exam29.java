package ch02.control;

/**
 * @Data :
 * @Author : 강사
 * @Description :  제어문 - 반복문 (do ~ while 문)
 */

public class Exam29 {
	public static void main(String[] args) {
		int x=10;
		
		while(x>50){
			System.out.println("while x:" + x);
		}
		
		do{
			System.out.println("do x:" + x);
		}while(x>50);
	}
}
