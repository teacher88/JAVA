package ch03.array;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �迭
 */

public class Exam39 {
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�迭����  �Է��ϼ���:");
		int su=sc.nextInt();
		System.out.println();
		
		int[] array=new int[su];
		
		for(int i=0;i<array.length;i++){
			System.out.print((i+1) + "��° ���ڸ� �Է��ϼ���:");
			array[i]=sc.nextInt();
		}
		
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + "\t");
		}
		System.out.println();
		
		sc.close();
	}
}

