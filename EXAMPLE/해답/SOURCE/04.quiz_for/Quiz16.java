package ch02.quiz_for;

/**
 * @Data : 
 * @Author : ����
 * @Description : �ݺ��� �ǽ����� 16�� Ǯ��
 *                    ���� 16) 10���� 20������ ���� ���Ͽ� ���α׷��� �ۼ��Ͻÿ�. 
 *								 (for��, while��, do-while���� �̿��Ͽ� 3���� ���α׷� �Ͻÿ�.)
*/

public class Quiz16 {
	public static void main(String[] args){		
		int fSum=0, wSum=0, dSum=0;
		
		// for��
		for(int i=0;i<=20;i++){
			fSum=fSum+i;
		}
		System.out.println("fSum:" + fSum);
		
		// while
		int j=0;
		while(j<=20){
			wSum=wSum+j;
			j++;
		}
		System.out.println("wSum:" + wSum);
		
		// do ~  while
		int k=0;
		do{
			dSum=dSum+k;
			k++;
		}while(k<=20);
		System.out.println("dSum:" + dSum);
	}
}
