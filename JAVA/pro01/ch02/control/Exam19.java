package ch02.control;

/**
 * @Data :
 * @Author : ����
 * @Description :  ��� - ���ǹ� (switch ~ case ��)
 */

public class Exam19 {
	 public static void main(String[] ar){
			int su=4;
			switch(su){
			case 1:
				System.out.println("1���� ���Խ��ϴ�.");
				break;
			case 2:
				System.out.println("2���� ���Խ��ϴ�.");
				break;
			case 3:
				System.out.println("3���� ���Խ��ϴ�.");
				break;
			case 4:
				System.out.println("4���� ���Խ��ϴ�.");
				break;
			case 5:
				System.out.println("5���� ���Խ��ϴ�.");
				break;
			default : 
				System.out.println("1~5������ ���ɴϴ�.");
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








