package ch02.quiz_for;

/**
 * @Data :
 * @Author : ����
 * @Description : �ݺ��� �ǽ����� 15�� Ǯ��
 *                    ���� 15) �� ���� �ֻ����� ������ ��, ���� ���� 6�� �Ǵ� ��� ���� ����ϴ�
 *                               ���α׷��� �ۼ��ϼ���. 
*/

public class Quiz15 {
	public static void main(String[] agrs){
		
		for(int i=1;i<=6;i++){
			for(int j=1;j<=6;j++){
				if(i+j==6){
					System.out.println(i + "+" + j + "=" + (i+j));
				}
			}
		}
	}
}
