package ch04.quiz;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �Լ� �ǽ����� 12
 *                     ���� 12) ���� ���� �Լ��� ��� ���� ���� ���α׷��� �ϼ��Ͻÿ�. (Call By Value)
 */

public class Quiz12 {
	public static void main(String[] args){
		outAtoZ();
		out1to10();
		sum1to10();		
	}

	
	public static void outAtoZ(){
		for(char i='A'; i<='Z';i++){
			System.out.print(i);
		}
		System.out.println();
	}
	
	public static void out1to10(){
		for(int i=1; i<=10;i++){
			System.out.print(i);
		}
		System.out.println();
	}
	
	public static void sum1to10(){
		int sum=0;
		for(char i=1; i<=10;i++){
			sum +=i;
		}
		System.out.println("1����10������ ��:" + sum);
	}
}
