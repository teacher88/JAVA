package ch03.quiz;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �迭 �ǽ����� 8��
 */

public class Quiz08 {
	public static void main(String[] args) {
		double sum=0.0;
		double array[]={1.0, 2.3, 3.4, 5.5};
		
		// for��
		for(int i=0;i<array.length;i++){
			sum+=array[i];
		}
		System.out.println("forSum:"+ sum + "\n");
		
		// while��
		int cnt=0;
		double wsum=0;
		while(array.length > cnt){
			wsum+=array[cnt];
			cnt++;
		}
		System.out.println("wsum:" + wsum + "\n");
		
		// do ~ while��
		int count=0;
		double dsum=0;
		do{
			dsum+=array[count];
			count++;
		}while(array.length > count);
		System.out.println("wsum:" + dsum + "\n");
	}
}
