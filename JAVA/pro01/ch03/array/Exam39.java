package ch03.array;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  배열
 */

public class Exam39 {
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("배열수를  입력하세요:");
		int su=sc.nextInt();
		System.out.println();
		
		int[] array=new int[su];
		
		for(int i=0;i<array.length;i++){
			System.out.print((i+1) + "번째 숫자를 입력하세요:");
			array[i]=sc.nextInt();
		}
		
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + "\t");
		}
		System.out.println();
		
		sc.close();
	}
}

