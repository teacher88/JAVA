package ch02.quiz_control;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� �ǽ����� 16��
 */

public class Quiz16 {
	public static void main(String[] args) {
		boolean run=true;
		int balance=0;
		
		Scanner sc=new Scanner(System.in);
		while(run){
			System.out.println("-----------------------------------------");
			System.out.println("1.���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("-----------------------------------------");
			
			System.out.print("����>>");
			int choice=sc.nextInt();
			
			if(choice==1){
				System.out.print("�Աݾ�>>");
				int inMoney=sc.nextInt();
				balance+=inMoney;
			}else if(choice==2){
				System.out.print("��ݾ�>>");
				int outMoney=sc.nextInt();
				balance-=outMoney;
			}else if(choice==3){
				System.out.println("�ܰ�>>" + balance);
			}else if(choice==4){
				System.out.println("���α׷� ����");
				break;				
			}
		}
		
		sc.close();
	}
}
