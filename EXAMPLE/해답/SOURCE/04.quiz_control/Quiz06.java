package ch02.quiz_control;

import java.io.IOException;
import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description : ��� �ǽ����� 6�� Ǯ��
 *                    ���� 6) Ű����κ��� �Է��� ���ڰ� M �Ǵ� m�̸� man, W �Ǵ� w�̸� woman,
 *							    �� �� �̸� ???�� ȭ��� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�. (if��)
 */

public class Quiz06 {
	public static void main(String[] args) throws IOException{		
		Scanner sc=new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���:");
		String str=sc.next();
		char ch=str.charAt(0);
		
		if(ch=='m' || ch=='M'){
			System.out.println("man");
		}else if(ch=='w' || ch=='W'){
			System.out.println("woman");
		}else{
			System.out.println("???");
		}
		
		sc.close();
	}
}
