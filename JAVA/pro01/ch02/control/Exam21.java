package ch02.control;

/**
 * @Data :
 * @Author : 강사
 * @Description :  제어문 - 조건문 (switch ~ case 문)
 */

public class Exam21 {
	public static void main(String[] args) {
		int su=5;
		switch(su+10){
		case 10:
			System.out.println("10번이 나왔습니다.");
			break;
		case 15:
			System.out.println("15번이 나왔습니다.");
			break;
		case 20:
			System.out.println("20번이 나왔습니다.");
			break;
		case 25:
			System.out.println("25번이 나왔습니다.");
			break;
		}
		System.out.println();
		
		switch(su%2){
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		}
	}
}

