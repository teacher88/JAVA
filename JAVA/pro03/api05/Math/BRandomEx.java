package api05.Math;

/**
 * @Data : 
 * @Author : ����
 * @Description :  Math Ŭ���� 
 */

import java.util.Arrays;

public class BRandomEx {
	public static void main(String[] ar){
		System.out.println("20�� ���밪:" + Math.abs(-20));
		System.out.println("�ִ밪:" + Math.max(10, 30));
		System.out.println("�ּҰ�:" + Math.min(1.5, 1.3));
		System.out.println("2��3��:" + (int) Math.pow(2,3));
		System.out.println();	;
				
		int ran=(int) (Math.random() * 10);  
		System.out.println("[�����Լ� 0~9] : " + ran);
	
		String[] array=new String[] {"�̿���", "���μ�", "ȫ�浿"};
		int dom=(int) (Math.random() * array.length);
		System.out.println("[�����Լ� 0~9] : " + array[dom]);
		System.out.println();	;
		
		int num=(int) (Math.random() * 6) +1;
		System.out.println("[�ֻ��� �� 1~6] : " + num);
		System.out.println();	;
		
		int[] selectNumber=new int[6];
		System.out.print("[���ù�ȣ:");
		for(int i=0;i<selectNumber.length;i++){
			selectNumber[i]=(int) (Math.random() * 45) + 1;
		}
		Arrays.sort(selectNumber);
		System.out.println(Arrays.toString(selectNumber));
		
		int[] winnigNumber=new int[6];
		System.out.print("[��÷��ȣ:");
		for(int i=0;i<winnigNumber.length;i++){
			winnigNumber[i]=(int) (Math.random() * 45) + 1;
		}
		Arrays.sort(winnigNumber);
		System.out.println(Arrays.toString(winnigNumber));
		
		boolean result=Arrays.equals(selectNumber, winnigNumber);
		if(result){
			System.out.println("��÷ �Ǿ����ϴ�.");
		}else{
			System.out.println("��÷ �����ʾҽ��ϴ�.");
		}  				
	}
}

