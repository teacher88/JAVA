package api05.Math;

/**
 * @Data : 
 * @Author : ����
 * @Description :  Math Ŭ���� 
 */

import java.util.Arrays;

public class CLotterEx {

	public static void main(String[] args) {
		int count=0;
		
		while(true){
			System.out.println(++count);
				
			int[] selectNumber=new int[6];
			for(int i=0;i<selectNumber.length;i++){
				selectNumber[i]=(int) (Math.random() * 45) + 1;
			}
			
			int[] machineNumber=new int[6];
			for(int i=0;i<machineNumber.length;i++){
				machineNumber[i]=(int) (Math.random() * 45) + 1;
			}

			boolean result=Arrays.equals(selectNumber, machineNumber);
			if(result){
				Arrays.sort(machineNumber);
				System.out.println("���:" + Arrays.toString(machineNumber));
				break;
			}
		}
	}
}







