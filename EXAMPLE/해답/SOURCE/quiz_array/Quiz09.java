package ch03.quiz;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �迭 �ǽ����� 9��
 * 					    ���� 9) ������ 10�� �Է� �޾� �迭�� ������ ��, �迭�� �˻��Ͽ� 3�� ����� ��� ����ϴ�
 *                               ���α׷��� �ۼ��ϼ���.
 */

public class Quiz09 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] array=new int[10];
		
		System.out.print("���� 10�� �Է� >>" );
		for(int i=0;i<array.length;i++){
			array[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<array.length;i++){
			if(array[i]%3==0){
				sum+=array[i];
			}
		}
		System.out.println("sum:" + sum);

		sc.close();
	}
}
