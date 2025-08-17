package ch02.control;

/**
 * @Data :
 * @Author : 강사
 * @Description :  제어문 - 조건문 (if ~ else문)
 */

public class Exam13 {
	public static void main(String[] args) {
		int score=50;
		if(score >=50){
			System.out.println("합격입니다. 점수는" + score + "입니다.");
		}else{
			System.out.println("불합격입니다. 점수는" + score + "입니다.");
		}
		System.out.println();
		
		String name="홍길동";
		int age=27;
		if(age>=20 && age<30){
			System.out.println("저는" + name + "입니다." + age + "대라서 행복합니다.");
		}else{
			System.out.println("20대가 아닙니다.");
		}
		
	}
}
