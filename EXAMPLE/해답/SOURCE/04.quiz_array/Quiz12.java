package ch03.quiz;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �迭 �ǽ����� 12��
 *                      ���� 12) 5���� ���� �Է� �޾� ū ������� �����ϴ� ���α׷��� ����� ����.
 */

public class Quiz12 {
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		int[] su=new int[5];
		
		for(int i=0;i<su.length;i++){
			System.out.print("�� �Է�:");
			su[i]=sc.nextInt();    					// 10 2 77 88 6
		}
		
		for(int i=0;i<su.length;i++){       
			for(int j=i+1;j<su.length;j++){
				if(su[i] < su[j]){         			// 10<2, 10<77, 77<88
					int temp=su[i];     			//         temp 10  77
					su[i]=su[j];					//         su[i] 77 88
					su[j]=temp;        			//         su[j] 10 
				}
			}
		}
		
		for(int i=0;i<su.length;i++){
			System.out.print(su[i] + "\t");
		}
		
		sc.close();
	}
}
