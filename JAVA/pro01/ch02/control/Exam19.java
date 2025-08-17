package ch02.control;

/**
 * @Data :
 * @Author : 강사
 * @Description :  제어문 - 조건문 (switch ~ case 문)
 */

public class Exam19 {
	 public static void main(String[] ar){
			int su=4;
			switch(su){
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
			default : 
				System.out.println("1~5까지만 나옵니다.");
				break;
			}
			System.out.println();
						
			int value=3;
			switch(value){
			case 1: case 2: case 3: 
				System.out.println("hahaha");
				break;
			case 4: case 5: case 6: 
				System.out.println("hohoho");
				break;
			case 7: case 8: case 9: 
				System.out.println("hehehe");
				break;
			default :
				System.out.println("etc");
				break;
			}
		}
}








