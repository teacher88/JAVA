package ch02.control;

import java.util.Scanner;
import java.io.IOException;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ǥ�� �����
 */

public class Exam36 {
	public static void main(String[] ar)throws IOException{
		
		Scanner sc=new Scanner(System.in);
		char loop=0;
		
		do{
			System.out.print("���� �Է��ϼ���:");
			int dan=sc.nextInt();
			
			for(int i=1;i<=9;i++){
				System.out.println(dan + "*" + i + "=" + (dan * i));
			}			
			System.out.println();
			
			System.out.print("���ҷ�(y/n):");
			loop=(char)System.in.read();
			System.in.read();
			System.in.read();
			
		}while(loop=='Y' || loop=='y');
		
		sc.close();
	}
}

