package ch02.quiz_for;

/**
 * @Data : 
 * @Author : ����
 * @Description : �ݺ��� �ǽ����� 10�� Ǯ��
 *                    ���� 10) for���� �̿��ؼ� ���� ����� ���� �ﰢ���� ����ϴ� �ڵ带 �ۼ��ϼ���.
 */

public class Quiz10 {
	public static void main(String[] args) {
		for(int i=0;i<=5;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
