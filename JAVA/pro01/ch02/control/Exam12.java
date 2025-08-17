package ch02.control;

/**
 * @Data :
 * @Author : 강사
 * @Description :  제어문 - 조건문 (if ~ else문)
 */

public class Exam12 {
	public static void main(String[] ar){
		int a=-25;
		
		if(a>0)
			System.out.println("양수입니다.");
		else
			System.out.println("음수입니다.");
		
		if(a%2==0){
			a+=100;
			System.out.println("짝수입니다." + a);
		}else{
			a*=200;
			System.out.println("홀수입니다." + a);
		}
		
		// 삼항식 표현
		String str=a>0 ? "양수":"음수";
		System.out.println(str);
	}
}
