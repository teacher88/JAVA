package ch02.quiz_control;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description : ��� �ǽ����� 3�� Ǯ��
 *                    ���� 3) �� ���� ���� �Է� �޾Ƽ� �� �� ū ���� ����ϴ� ���α׷��� �ۼ��ϼ���. (if��) 
 */

public class Quiz03 {
	public static void main(String[] args){		
		Scanner sc=new Scanner(System.in);
		System.out.print("ù��° ���� �Է��ϼ���:");
		int first=sc.nextInt();
		
		System.out.print("�ι�° ���� �Է��ϼ���:");
		int second=sc.nextInt();
		
		if(first > second){
			System.out.println("first=" + first);
		}else {
			System.out.println("second=" + second);
		}
		
		sc.close();
	}
}
