package ch02.quiz_control;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description : ��� �ǽ����� 4�� Ǯ��
 *                    ���� 4) ��������� � 300�� û���� 200�� ��̰� 100���̶�� �� ��, 
 *							   �Է��� �ο� ��ü�� ���� ����� ȭ��� ǥ���ϴ� ���α׷��� �ۼ��ϼ���. 
 *							   (��, ��� 5�� �̻� �̸� ��̴� 50���̴�.) (if��)
 */

public class Quiz04 {
	public static void main(String[] args){		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("� �ο���:");
		int adult=sc.nextInt();
		
		System.out.print("û�� �ο���:");
		int student=sc.nextInt();
		
		System.out.print("��� �ο��� :");
		int child=sc.nextInt();
		
		int sum=0;
		
		if(adult >=5){
			sum=(adult*300)+(student*200)*(child*50);
		}else{
			sum=(adult*300)+(student*200)*(child*100);
		}
		
		System.out.println("��°��:" + sum);
		
		sc.close();
	}
}










