package ch02.control;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� - �ݺ��� (do ��)
 */

public class Exam27 {
	public static void main(String[] ar){
		int x=1;
		while(x<=10){
			System.out.print("x:" +  x + "\t");
			x++;
		}
		System.out.println("\n");
		
		int sum=0;
		int y=1;
		while(y<=100){
			sum+=y;
			y++;
		}
		System.out.println("sum:" +  sum + "\n");
		
		int i=1;
		while(i<=5){
			int j=1;
			while(j<=3){
				System.out.print(i + "," + j + "\t");
				j++;
			}
			i++;
			System.out.println();
		}
	}
}











