package ch02.control;

import java.io.IOException;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  표준 입출력
 */
 
public class Exam35 {
	public static void main(String[] ar)throws IOException{
		char ch1=0;
		do{
			System.out.println("Hello java!!");
			System.out.print("계속(y/n)?");
			
			ch1=(char)System.in.read();
			System.in.read();
			System.in.read();		
			
			 if(ch1=='n' || ch1=='N')	break;
			 
		}while(ch1=='y' || ch1=='Y');
		
		System.out.println();
		System.out.println(">>>>>>>>>>>");
		System.out.println();
		
		while(true){
			System.out.println("Hello java!!");
			System.out.print("계속(y/n)?");
			
			char ch2=(char)System.in.read();
			System.in.read();
			System.in.read();
			
			if(ch2 !='y') break;
			
			// if(ch2=='n' || ch2=='N')	break;
		}
		System.out.println("End!");
	}
}
