package ch02.control;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  제어문 - 조건문 (중첩 if ~ else문)
 */ 

public class Exam17 {
	public static void main(String[] args) {
		int num=150;
		
		if(num > 0){
			if(num >200){
				System.out.println("200보다 큰수 입니다.");
			}else{
				System.out.println("200보다 작은수 입니다.");
			}
		}else{
			System.out.println("음수입니다");
		}
	}
}
