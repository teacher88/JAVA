package ch03.array;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �迭
 */

public class Exam40 {
	public static void main(String[] ar){
		int[] array=new int[5];
		System.out.println("ù��° �迭:" + array[1]);
		
		int value;
		// System.out.println(value); error
	
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<array.length;i++){
			System.out.print((i+1) + "��° ���� �Է��ϼ���:");
			array[i]=sc.nextInt();
		}
		System.out.println();
		
		int max=array[0];
		for(int i=0;i<array.length;i++){
			if(max < array[i])
				max=array[i];
		}
		System.out.println("max=" + max);
		
		int min=array[0];
		for(int i=0;i<array.length;i++){
			if(min > array[i])
				min=array[i];
		}
		System.out.println("min=" + min + "\n");		
		sc.close();
		
		// �迭 ���� ���
		char[] a=new char[] {'A','B','C'};  
		char b[]=new char[] {'A','B','C'};  
		char[] c={'A', 'B', 'C'};	 
		
		char[] x;
		// x={'A', 'B'}; error
		
		char[] y;
		y=new char[] {'A', 'B'};
		
		int[] z;
		z=new int[] {1, 2, 3};
		
		int[] su=null;						// su={0};
		z=new int[] {1, 2, 3};
	}
}
