package ch02.control;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� - ���ǹ� (if��)
 */

public class Exam11 {
	public static void main(String[] ar){
		int score=93;
		if(score >=90){
			System.out.println("������ 90���� Ů�ϴ�");
			System.out.println("����� A �Դϴ� \n");
		}
		
		int num=52;
		int value=24;
		if(num > value){
			System.out.println("num�� value���� ũ��.");
		}
		if(num == value){
			System.out.println("num�� value�� ����.");
		}
		if(num > value){
			System.out.println("num�� value���� �۴�. \n");
		}
		
		int su=20;
		if(su%2==0){
			System.out.println("¦���Դϴ�.");
		}
		if(su%2 !=0){
			System.out.println("Ȧ���Դϴ�.");
		}
	}
}
