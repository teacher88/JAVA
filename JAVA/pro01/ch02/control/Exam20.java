package ch02.control;

/**
 * @Data :
 * @Author : ����
 * @Description :  ��� - ���ǹ� (switch ~ case ��)
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
		
		String name="ȫ�浿";
		String gread="BB";
		String memberLevel="";
		
		switch(gread){
		case "AA":case "aa":
			memberLevel="��ȸ��";
			break;
		case "BB":case "bb":
			memberLevel="��ȸ��";
			break;	
		case "CC":case "cc":
			memberLevel="�մ�";
			break;				
		}
		
		System.out.println(name + "ȸ������" + memberLevel +"�Դϴ�." );
	}
}
