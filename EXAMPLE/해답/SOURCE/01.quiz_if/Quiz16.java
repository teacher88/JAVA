package ch02.quiz_if;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  조건문 실습문제 16번
 */

public class Quiz16 {
	public static void main(String[] args) {
		String position="과장";
		
		switch(position){
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		case "대리":
			System.out.println("300만원");
			break;
		case "사원":
			System.out.println("200만원");
			break;
		}
	}
}
