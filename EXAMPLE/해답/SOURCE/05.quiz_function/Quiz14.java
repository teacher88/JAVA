package ch04.quiz;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �Լ� �ǽ����� 14
 *                     ���� 14) �Լ��� �̿��Ͽ� "�� �����?"�� �����, '1'�� �Է��� ��� "�츰 õ�������ΰ� ��!!"��,
 *                                '2'�� �Է��� ���"����!!" �� ��µǰ� �Ͻÿ�. (Call By Value)
 */

public class Quiz14 {
	public static void main(String[] agrs){		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�� �����? (1:YES OR 2:NO):");
		int num=sc.nextInt();
		
		choose(num);
		
		sc.close();
	}
	
	public static void choose(int num){
		if(num==1){
			System.out.println("�츮�� õ�������ΰ���!!");
		}else if(num==2){
			System.out.println("����!!");
		}
	}
}
