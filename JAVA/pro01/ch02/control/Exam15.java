package ch02.control;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� - ���ǹ� (���� if ~ else��)
 */

public class Exam15 {
	public static void main(String[] args) {		
		int score=93;
		
		if(score >=90){
			System.out.println("������ 100~90 �Դϴ�.");
			System.out.println("����� A �Դϴ� \n");
		}else if(score >=80){
			System.out.println("������ 89~80 �Դϴ�");
			System.out.println("����� B �Դϴ� \n");
		}else if(score >=70){
			System.out.println("������ 79~70 �Դϴ�");
			System.out.println("����� C �Դϴ� \n");
		}else{
			System.out.println("������ 70 �̸� �Դϴ�");
			System.out.println("����� D �Դϴ� \n");
		}
	}
}
