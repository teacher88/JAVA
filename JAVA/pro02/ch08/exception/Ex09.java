package ch08.exception;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ���� ����� - throw
 */

import java.util.Scanner;

public class Ex09 {							
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);		
		
		try{
			System.out.print("���� �Է��ϼ���:");
			int b=sc.nextInt();
			
			if(b==10){
				NumberFormatException ex=new NumberFormatException("����ڰ� 10�� �Է��߽��ϴ�.");
				throw ex; 
			}
			
		}catch(Exception e){
			System.out.println("10�� �Է��ϼ̽��ϴ�. \n");
			System.out.println(e.getMessage());
		}finally{
			if(sc!=null) sc.close();
		}
	}
}



