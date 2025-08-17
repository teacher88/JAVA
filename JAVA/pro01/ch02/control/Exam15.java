package ch02.control;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  제어문 - 조건문 (다중 if ~ else문)
 */

public class Exam15 {
	public static void main(String[] args) {		
		int score=93;
		
		if(score >=90){
			System.out.println("점수가 100~90 입니다.");
			System.out.println("등급은 A 입니다 \n");
		}else if(score >=80){
			System.out.println("점수가 89~80 입니다");
			System.out.println("등급은 B 입니다 \n");
		}else if(score >=70){
			System.out.println("점수가 79~70 입니다");
			System.out.println("등급은 C 입니다 \n");
		}else{
			System.out.println("점수가 70 미만 입니다");
			System.out.println("등급은 D 입니다 \n");
		}
	}
}
