package ch02.quiz_for;

/**
 * @Data : 
 * @Author : ����
 * @Description : �ݺ��� �ǽ����� 9�� Ǯ��
 *                    ���� 9) ������ 2x+4y=10�� ��� �ظ� ���Ͻÿ�. �� x��y�� �����̰� ������ ������
 *  						   (�� 0<=x<=10, 0<=y<=10) �̴�. 
*/

public class Quiz09 {
	public static void main(String[] args){
		
		for(int x=0;x<=10;x++){
			for(int y=0;y<=10;y++){
				if(2*x+4*y==10){
					System.out.println("x=" + x + ", y=" + y);
				}
			}
		}
	}
}
