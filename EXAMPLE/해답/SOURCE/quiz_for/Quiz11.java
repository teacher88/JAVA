package ch02.quiz_for;

/**
 * @Data : 
 * @Author : ����
 * @Description : �ݺ��� �ǽ����� 11�� Ǯ��
 *                    ���� 11) 1~20������ ���� �߿��� 2�� ��� �Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�.
 *								[���ȭ��] sum:174
 */

public class Quiz11 {
	public static void main(String[] args){
		int sum=0;
		
		for(int i=1;i<=20;i++){
			if(i%2!=0 || i%3!=0) {
				// System.out.println(i);
				sum+=i;
			}
		}
		
		System.out.println("sum:" + sum);
	}
}
