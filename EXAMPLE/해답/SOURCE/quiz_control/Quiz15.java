package ch02.quiz_control;

import java.util.Scanner;
import java.io.IOException;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  제어문 실습문제 15번
 *						실습문제 15) 다음은 사칙연산 프로그램이다. 아래의 출력화면 보고 프로그램을 작성하세요.  
 */

public class Quiz15 {
	public static void main(String[] ar)throws IOException{
		Scanner sc=new Scanner(System.in);
		int su, value;
		char buho;
		
		do{
			System.out.print("수를 입력하세요:");
			su=sc.nextInt();
			
			System.out.print("부호를 입력하세요(+, -, *, /) :");
			String str=sc.next();
			buho=str.charAt(0);
			
			System.out.print("수를 입력하세요:");
			value=sc.nextInt();
		}while(buho !='+' && buho !='-' && buho !='*' && buho !='/' );
		
		if(buho=='+')
			System.out.println(su + "" + buho + value + "=" + (su+value));
		else if(buho =='-')
			System.out.println(su + "" + buho + value + "=" + (su-value));
		else if(buho =='*')
			System.out.println(su + "" + buho + value + "=" + (su*value));
		else if(buho =='/'){
			if(value==1) value=1;
			System.out.println(su + "" + buho + value + "=" + ((float)su/value));
		}	
		sc.close();
	}
}
