package ch08.quiz;

import java.util.Scanner;

public class Quiz15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���:");
		String su=sc.next();
		
		try{
			if(su.length() !=10){
				NumberFormatException e=new NumberFormatException();
				throw e;
			}
			System.out.println("�Է��Ͻ� ����" + Integer.parseInt(su)  + "�Դϴ�.");
		}catch(NumberFormatException e){
			System.out.println("�����߻�!! ��Ȯ�� 10�ڸ��� �Է� �����մϴ�.");		
		}finally{
			sc.close();
		}
		
		sc.close();
	}
}
