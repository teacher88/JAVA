package ch03.array;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �������迭
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
		
		System.out.println("��ü���:" + sum/(score.length*score[0].length));   // ��/(�ళ��*������), �������� �ٵȴ�(������2)
	
		// �迭 ���� ���
		int[][] a=new int[][] {{1, 2, 3}, {1,2,3}};  
		int b[][]=new int[][] {{1, 2, 3}, {1,2,3}};  
		int[][] c={{1, 2, 3}, {1,2,3}}; 
		
		int[][] x;
		// x={{1, 2, 3}, {1,2,3}};   error
		
		int[][] y;
		y=new int[][] {{1, 2, 3}, {1,2,3}}; 
	}
}








