package ch02.quiz_control;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� �ǽ����� 12�� Ǯ��
 * 						���� 12) 10���� ������ �Է� �޾Ƽ� ����� ������ ������ ���ϴ� 
 *                                ���α׷��� �ۼ��ϼ���. (for��)
 */

public class Quiz12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int plusCount=0, minusCount=0;
		
		for(int i=0;i<10;i++){
			System.out.print("���� �Է��ϼ���:");
			int su=sc.nextInt();
			if(su > 0){
				plusCount++;
			}else{
				minusCount++;
			}
		}

		System.out.println("�������:" + plusCount);
		System.out.println("��������:" + minusCount);
		
		sc.close();
	}
}
