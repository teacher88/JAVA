package ch02.control;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� - �ݺ��� (for ��)
 */

public class Exam24 {
	public static void main(String[] ar){
		int dan=2;
		for(int i=1;i<=9;i++){
			System.out.println(dan + "*" + i + "=" + (dan *i));
		}
		System.out.println("\n");
		
		int hap=0;
		for(int i=1;i<=10;i++){
			hap=hap+i; 		
			System.out.print(i);
			
			if(i<=9){
				System.out.print("+");
			}else{
				System.out.println("=" + hap);
			}
		}
	}
}
