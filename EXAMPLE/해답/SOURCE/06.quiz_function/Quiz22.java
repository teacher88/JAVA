package ch04.quiz;



/**
 * @Data : 
 * @Author : ����
 * @Description :  �Լ� �ǽ����� 22
 *                     ���� 22) 1���� 999������ 100���� ������ ���� �̷���� �迭�� �־����� ��, ���� ����� �Լ����� 
 *                                  ���� �����Ѵ�. �迭�� ������ ��, (Call By Value, Call By Value ~ Return)
 *									��	�迭�� ������ �� �ٿ� 10���� ����ϴ� �Լ�, �̶� �� ������ ���� �������� ��
 * 									��	Ȧ���鸸 ����ϴ� �Լ�, ��µǴ� ����� a�� ������
 * 									��	�ε����� Ȧ���� ������ ����ϴ� �Լ�, ��µǴ� ����� ��� ������
 * 									��	¦���� ������ ��ȯ�ϴ� �Լ�
 * 									��	�迭�� ������ ���� ��ȯ�ϴ� �Լ�
 * 									��	���� ���� ���� ��ġ(�ε���)�� ��ȯ�ϴ� �Լ�
 * 									��	���� ū ���� ��ġ�� ��ȯ�ϴ� �Լ�
 * 									��	��� ����� ���� ���ο� �迭�� �����ϴ� �Լ�, �̶� ���ο� �迭�� ũ��� 100���� ��
 */

public class Quiz22 {
	public static void main(String[] args) {
		int[] array=new int[100];		// 100�� �迭 ����
		for(int i=0;i<100;i++){			// ������ ������ ����
			array[i]=i+20;
		}
		
		funA(array);						// �迭�� ������ �� �ٿ� 10���� ����ϴ� �Լ�
		funB(array);						// Ȧ���鸸 ����ϴ� �Լ�
		funC(array);						// �ε����� Ȧ���� ������ ����ϴ� �Լ�
		
		int eventCnt=funD(array);		// ¦���� ������ ��ȯ�ϴ� �Լ�
		int arraySum=funE(array);		// �迭�� ������ ���� ��ȯ�ϴ� �Լ�
		int arrayMin=funF(array);		// ���� ���� ���� ��ġ(�ε���)�� ��ȯ�ϴ� �Լ�
		int arrayMax=funG(array);		//  ���� ū ���� ��ġ�� ��ȯ�ϴ� �Լ�
		
		System.out.println("¦���� ����:" + eventCnt);
		System.out.println("�迭�� ������ ��:" + arraySum);
		System.out.println("���� ���� ���� ��ġ :" + arrayMin);
		System.out.println("���� ū ���� ��ġ :" + arrayMax);
		
		funH(array);						// ��� ����� ���� ���ο� �迭�� �����ϴ� �Լ�
	}
	public static void funA(int[] array){
		System.out.println("�� �ٿ� 10���� ���---------------------");
		
		for(int i=0;i<100;i++){
			System.out.print(array[i] + "\t");
			
			if((i+1)%10==0) System.out.println();
		}
		
		System.out.println();
	}
	
	public static void funB(int[] array){
		int count=0;

		System.out.println("Ȧ���鸸 ����ϴ� �Լ�-------------------");
		
		for(int i=0;i<100;i++){
			if(array[i]%2 !=0){
				System.out.print(array[i] + "\t");
				
				if(++count%10==0) System.out.println();
			}
		}
		
		System.out.println();
	}
	
	public static void funC(int[] array){
		int count=0;
		
		System.out.println("�ε����� Ȧ���� ������ ����ϴ� �Լ�--------------");	
		for(int i=0;i<100;i++){
			if(i%2 !=0){
				System.out.print(array[i] + "\t");
				
				if(++count%10==0) System.out.println();
			}
		}
		
		System.out.println();
	}
	
	public static int funD(int[] array){
		int count=0;
		
		for(int i=0;i<100;i++){
			if(array[i] %2 ==0) count++;
		}
		
		return count;
	}
	
	public static int funE(int[] array){
		int sum=0;
		
		for(int i=0;i<100;i++){
			sum +=array[i];
		}
		
		return sum;
	}
	
	public static int funF(int[] array){
		int temp=0;
		
		for(int i=0;i<100;i++){
			if(array[temp] > array[i]) temp=i;
		}	
		
		return temp;
	}
	
	public static int funG(int[] array){
		int temp=0;
		
		for(int i=0;i<100;i++){
			if(array[temp] < array[i]) temp=i;
		}		
		
		return temp;
	}
	
	public static void funH(int[] array){
		int[] evenArray=new int[100];
		
		int count=0;
		for(int i=0;i<100;i++){
			if(array[i] > 0) {
				evenArray[i]=array[i];
				++count;
			}
		}
		
		System.out.println("����� ��:" + count);
	}
}











