package ch03.array;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �迭
 */

public class Exam38 {
	public static void main(String[] ar){
		int[] array=new int[5];
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}

		Scanner sc=new Scanner(System.in);
		for(int i=0;i<array.length;i++){
			System.out.print((i+1) + "��° ���� �Է��ϼ���:");
			array[i]=sc.nextInt();
		}
		System.out.println();
		
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + "\t");
		}
		
		sc.close();
	}
}

