package ch05.quiz02;

/**
 * @Data : 
 * @Author : ����
 * @Description :  Ŭ����2- �ǽ����� 29) ��Ģ����
 */

import java.util.Scanner;
import java.io.IOException;

class Yonsan{
	private int su, value;
	private char buho;
	private int resultInt;
	private float resultFloat;
	private Scanner sc;
	
	public void input() throws IOException{
		sc=new Scanner(System.in);
		
		do{
			System.out.print("���� �Է��ϼ���:");
			su=sc.nextInt();
			
			System.out.print("��ȣ�� �Է��ϼ���:");
			buho=(char)System.in.read();
			System.in.read();
			System.in.read();
			
			System.out.print("���� �Է��ϼ���:");
			value=sc.nextInt();
		}while(buho !='+' && buho !='-' && buho !='*' && buho !='/' );
	}
	
	public void yonsan(){
		if(buho=='+')
			resultInt=su+value;
		else if(buho =='-')
			resultInt=su-value;
		else if(buho =='*')
			resultInt=su*value;
		else if(buho =='/'){
			if(value==0) value=1;
			resultFloat=(float)su/value;
		}
	}
	
	public void disp(){
		if(buho=='/')
			System.out.println(su + "" + buho + value + "=" + resultFloat);
		else
			System.out.println(su + "" + buho + value + "=" + resultInt);
			
	}
}

public class Quiz29 {
	public static void main(String[] ar)throws IOException{
		Yonsan y=new Yonsan();
		y.input();
		y.yonsan();
		y.disp();
	}
}
