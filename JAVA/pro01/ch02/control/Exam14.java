package ch02.control;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  제어문 - 조건문 (다중 if ~ else문)
 */

public class Exam14 {
	public static void main(String[] args) {
		int num=52;
		int value=24;
		
		if(num > value){
			System.out.println("num가 value보다 크다.");
		}else if(num == value){
			System.out.println("num와 value가 같다.");
		}else if(num > value){
			System.out.println("num가 value보다 작다. \n");
		}
		
	}
}
