package ch02.control;

/**
 * @Data :
 * @Author : ����
 * @Description :  ��� - ���ǹ� (switch ~ case ��)
 */

public class Exam21 {
	public static void main(String[] args) {
		int su=5;
		switch(su+10){
		case 10:
			System.out.println("10���� ���Խ��ϴ�.");
			break;
		case 15:
			System.out.println("15���� ���Խ��ϴ�.");
			break;
		case 20:
			System.out.println("20���� ���Խ��ϴ�.");
			break;
		case 25:
			System.out.println("25���� ���Խ��ϴ�.");
			break;
		}
		System.out.println();
		
		switch(su%2){
		case 0:
			System.out.println("¦��");
			break;
		case 1:
			System.out.println("Ȧ��");
			break;
		}
	}
}

