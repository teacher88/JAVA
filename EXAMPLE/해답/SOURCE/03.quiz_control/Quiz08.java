package ch02.quiz_control;

import java.io.IOException;
import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description : ��� �ǽ����� 8�� Ǯ��
 *                    ���� 8) ������ �ϳ��� �Է� �޾Ƽ� ��ҹ��ڷ� ��ȯ�ϼ���. 
 */

public class Quiz08 {
	public static void main(String[] args) throws IOException{				
		Scanner sc=new Scanner(System.in);
		
		System.out.print("������,�ҹ��� �ϳ��� �Է��ϼ���.");
		String str=sc.next();
		char ch=str.charAt(0);
		
		if(ch >= 'A' && ch <='Z'){
			System.out.println("�빮�� �ҹ��ں�ȯ:" + (ch+=32));
		}else if(ch >='a' && ch <='z'){
			System.out.println("�ҹ��� �빮�ں�ȯ:" + (ch-=32));
		}
		
		sc.close();
	}
}
