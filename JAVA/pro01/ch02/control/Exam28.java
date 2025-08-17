package ch02.control;

/**
 * @Data :
 * @Author : 강사
 * @Description :  제어문 - 반복문 (do ~ while 문)
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






