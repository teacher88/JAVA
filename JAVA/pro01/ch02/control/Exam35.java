package ch02.control;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ǥ�� �����
 */
 
import java.util.Scanner;

public class Exam35 {
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);
		
		char ch1=0;
		do{
			System.out.println("Hello java!!");
			System.out.print("���(y/n)?");
			
			String str=sc.next();
			ch1=str.charAt(0);
			
			 if(ch1=='n' || ch1=='N')	break;
			 
		}while(ch1=='y' || ch1=='Y');
		
		System.out.println();
		System.out.println(">>>>>>>>>>>");
		System.out.println();
		
		while(true){
			System.out.println("Hello java!!");
			System.out.print("���(y/n)?");
			
			String str=sc.next();
			char ch2=str.charAt(0);

			
			if(ch2 !='y') break;
			
			// if(ch2=='n' || ch2=='N')	break;
		}
		System.out.println("End!");
		
		sc.close();
	}
}

