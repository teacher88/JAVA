package ch03.array;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  다차원배열
 */

public class Exam42 {
	public static void main(String[] args) {		
		double score[][]=new double [][] {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
		
		double sum=0.0;
		for(int i=0;i<score.length;i++){
			for(int  j=0;j<score[i].length;j++){
				sum+=score[i][j];
			}
		}
		
		System.out.println("전체평균:" + sum/(score.length*score[0].length));   // 합/(행개수*열개수), 열번지는 다된다(열개수2)
	
		// 배열 선언 방법
		int[][] a=new int[][] {{1, 2, 3}, {1,2,3}};  
		int b[][]=new int[][] {{1, 2, 3}, {1,2,3}};  
		int[][] c={{1, 2, 3}, {1,2,3}}; 
		
		int[][] x;
		// x={{1, 2, 3}, {1,2,3}};   error
		
		int[][] y;
		y=new int[][] {{1, 2, 3}, {1,2,3}}; 
	}
}








