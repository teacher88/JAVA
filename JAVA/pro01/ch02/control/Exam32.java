package ch02.control;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� - break, continue
 */

public class Exam32 {
	public static void main(String[] ar){
		int x=1;
		while(x<10){
			if(x==5) break;
			
			System.out.println("x:" + x);
			x++;
		}
		System.out.println();
		
		int y=0;
		do{
			y++;
		
			if(y==5) continue;			
			System.out.println("y:" + y);
		}while(y<10);
	}
}

