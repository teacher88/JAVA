package ch04.quiz;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :  �Լ� �ǽ����� 21
 *                     ���� 21) ����(��Ģ����) ���α׷��� �ۼ��ϼ���. �Լ��� ����, ����, ����, 
 *                                ������ �Լ��� ���� �մϴ�. (Call By Value)
 */

public class Quiz21 {
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);
		int su, value;
		char buho;
		
		do{
			System.out.print("Input Su:");
			su=sc.nextInt();
			
			System.out.print("Input buho:");
			String str=sc.next();
			buho=str.charAt(0);
			
			System.out.print("Input Value:");
			value=sc.nextInt();
			
		}while(buho !='+' && buho !='-' && buho !='*' && buho !='/');
		
		if(buho=='+'){
			hap(su, buho, value);
		}else if(buho=='-'){
			cha(su, buho, value);
		}else if(buho=='*'){
			mul(su, buho, value);
		}else if(buho=='/'){
			div(su, buho, value);
		}
		
		sc.close();
	}
	
	public static void hap(int su, char buho, int value){
		System.out.println(su + "" + buho + value + "=" + (su+value));
	}
	
	public static void cha(int su, char buho, int value){
		System.out.println(su + "" + buho + value + "=" + (su-value));
	}

	public static void mul(int su, char buho, int value){
		System.out.println(su + "" + buho + value + "=" + (su*value));
	}
	
	public static void div(int su, char buho, int value){
		if(value==0) value=1;
		System.out.println(su + "" + buho + value + "=" + ((float)su/value));
	}
}