package api02.System;

/**
 * @Data :
 * @Author : ����
 * @Description :  System Ŭ���� 
 *                      exit(int status) : ���α׷� ���� 
 *                               ���� ������ ��� 0���� �����ϰ� ������ ������ ���0�̿� �ٸ����� �ش�.
 *                               � ���� �ִ��� ���� �ȴ�.
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ASystem{
	public static void main(String[] args) throws IOException{
		PrintStream ps=System.out;
		ps.println("API �����Դϴ�.");
		ps.println(10);
		ps.println(24.f);
		
		InputStream is=System.in;
		System.out.print("���� �Է�:");
		char value=(char) is.read();
		is.read();
		is.read();
		System.out.println("value:" + value + "\n\n");
		
		Scanner sc=new Scanner(is);
		while(true){
			System.out.print("�� �Է�:");
			int su=sc.nextInt();
			
			if(su==5){
				System.out.println("���α׷��� �����մϴ�");
				sc.close();
				System.exit(0);          // break, return
			}
		}
	}
}
