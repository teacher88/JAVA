package ch02.quiz_for;

/**
 * @Data : 
 * @Author : ����
 * @Description : �ݺ��� �ǽ����� 08�� Ǯ��
 *                    ���� 8) for���� �̿��ؼ� 1���� 100������ ���� �߿��� 3�� ����� ������ ���ϴ� 
 *                              ���α׷���  �ۼ��ϼ���. [���ȭ��] sum:1683
 */

public class Quiz08 {
	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1;i<=100;i++){
			if(i%3==0){
				sum +=i;
			}
		}
		
		System.out.println("sum:"  + sum);
	}
}