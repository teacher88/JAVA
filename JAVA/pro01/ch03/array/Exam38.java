package ch03.array;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  배열
 */

public class Exam38 {
	public static void main(String[] ar){
		int[] array=new int[5];
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}

		Scanner sc=new Scanner(System.in);
		for(int i=0;i<array.length;i++){
			System.out.print((i+1) + "번째 수를 입력하세요:");
			array[i]=sc.nextInt();
		}
		System.out.println();
		
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + "\t");
		}
		
		sc.close();
	}
}

