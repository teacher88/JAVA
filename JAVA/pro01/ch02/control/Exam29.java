package ch02.control;

/**
 * @Data :
 * @Author : ����
 * @Description :  ��� - �ݺ��� (do ~ while ��)
 */

public class Exam29 {
	public static void main(String[] args) {
		int x=10;
		
		while(x>50){
			System.out.println("while x:" + x);
		}
		
		do{
			System.out.println("do x:" + x);
		}while(x>50);
	}
}
