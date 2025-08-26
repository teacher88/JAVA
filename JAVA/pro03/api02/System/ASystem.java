package api02.System;

/**
 * @Data :
 * @Author : 강사
 * @Description :  System 클래스 
 *                      exit(int status) : 프로그램 종료 
 *                               정상 종료일 경우 0으로 지정하고 비정상 종료일 경우0이외 다른값을 준다.
 *                               어떤 값을 주더라도 종료 된다.
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ASystem{
	public static void main(String[] args) throws IOException{
		PrintStream ps=System.out;
		ps.println("API 시작입니다.");
		ps.println(10);
		ps.println(24.f);
		
		InputStream is=System.in;
		System.out.print("문자 입력:");
		char value=(char) is.read();
		is.read();
		is.read();
		System.out.println("value:" + value + "\n\n");
		
		Scanner sc=new Scanner(is);
		while(true){
			System.out.print("수 입력:");
			int su=sc.nextInt();
			
			if(su==5){
				System.out.println("프로그램을 종료합니다");
				sc.close();
				System.exit(0);          // break, return
			}
		}
	}
}
