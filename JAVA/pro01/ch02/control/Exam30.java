package ch02.control;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� - break, continue
 */

public class Exam30 {
	public static void main(String[] ar){
		for(int i=1;i<=10;i++){
			if(i==5)
				break;
			System.out.println("i:" + i);
		}
		System.out.println();
		
		for(int i=1;i<=10;i++){
			if(i==5)
				continue;
			System.out.println("i=" + i);
		}
		System.out.println();
	}
}
