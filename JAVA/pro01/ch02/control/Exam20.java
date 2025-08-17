package ch02.control;

/**
 * @Data :
 * @Author : 강사
 * @Description :  제어문 - 조건문 (switch ~ case 문)
 */

public class Exam20 {
	public static void main(String[] args) {
		char a='B';		
		
		switch(a){
		case 'W':case 'w':
			System.out.println("White");
			break;
		case 'B':case 'b':
			System.out.println("Blue");
			break;
		case 'Y':case 'y':
			System.out.println("Yellow");
			break;
		case 'R':case 'r':
			System.out.println("Red");
			break;
		}
		
		System.out.println("-----------------------------------");
		
		String name="홍길동";
		String gread="BB";
		String memberLevel="";
		
		switch(gread){
		case "AA":case "aa":
			memberLevel="정회원";
			break;
		case "BB":case "bb":
			memberLevel="준회원";
			break;	
		case "CC":case "cc":
			memberLevel="손님";
			break;				
		}
		
		System.out.println(name + "회원님은" + memberLevel +"입니다." );
	}
}
