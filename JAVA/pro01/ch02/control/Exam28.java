package ch02.control;

/**
 * @Data :
 * @Author : ����
 * @Description :  ��� - �ݺ��� (do ~ while ��)
 */

public class Exam28 {
	public static void main(String[] args) {
		int x=1;
		do{
			System.out.print("x:" + x + "\t");
			x++;
		}while(x <=10);
		System.out.println("\n");
		
		int sum=0;
		int y=1;
		do{
			sum+=y;
			y++;
		}while(y <= 100);
		System.out.println("sum:" + sum);
	}
}






