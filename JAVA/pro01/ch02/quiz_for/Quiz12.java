package ch02.quiz_for;

/**
 * @Data : 
 * @Author : ����
 * @Description : �ݺ��� �ǽ����� 12�� Ǯ��
 *                    ���� 12) 0.01 ~ 1 ���� 0.01�� �����Ͽ� �������� ���� ���ϴ� ���α׷��� �ۼ��ϼ���.
*								[���ȭ��] sum:50.499985
 */

public class Quiz12 {
	public static void main(String[] args) {
		float sum=0.0f;
		
		for(float i=0.01f; i<=1.0f; i=i+0.01f){
			sum +=i;
		}
		
		System.out.println("sum:" + sum);
	}
}
