package ch03.array;

/**
 * @Data :
 * @Author : 강사
 * @Description :  다차원배열
 */

public class Exam41 {
	public static void main(String[] ar){
		int[][] array=new int[][] {{10,20,30},{40,50,60}};

		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("array 배열의 행의 수:" + array.length);
		System.out.println("array 배열의 0행의 열 수 :" + array[0].length);
		System.out.println("array 배열의 1행의 열 수 :" + array[1].length);
		System.out.println();
		
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
