package ch04.function;
// import java.util.Scanner;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  main 함수
 */

public class Exam56 {
	public static void main(String[] ar){
		/* Scanner sc=null;
		for(int i=0;i<ar.length;i++){
			sc=new Scanner(ar[i]);
			int value=sc.nextInt();
			System.out.print(value + "\t");
		}
		sc.close(); */
		
		int hap=0;
		for(int i=0;i<ar.length;i++){
			int x=Integer.parseInt(ar[i]);
			hap +=x;
		}
		System.out.println("hap:" + hap);
	}
}


