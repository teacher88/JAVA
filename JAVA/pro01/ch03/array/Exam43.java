package ch03.array;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  다차원배열
 */

public class Exam43 {
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);
		int[][] array=new int[2][3];
		
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				System.out.print(i + "행" + j + "열" + "수를 입력하세요:");
				array[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
