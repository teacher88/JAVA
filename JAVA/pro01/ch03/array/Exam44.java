package ch03.array;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  다차원배열
 */

public class Exam44 {
	public static void main(String[] args) {
		int[][] brray=new int[][]{{1,2,3}, {4,5}, {6,7,8,9}};
		for(int i=0;i<brray.length;i++){
			for(int j=0;j<brray[i].length;j++){
				System.out.print(brray[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		int[][] array=new int[3][];
		array[0]=new int[3];
		array[1]=new int[2];
		array[2]=new int[4];
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				System.out.print("수입력:");
				array[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				System.out.print(array[i][j]);
			}
			System.out.println();
		}

		sc.close();
	}
}
