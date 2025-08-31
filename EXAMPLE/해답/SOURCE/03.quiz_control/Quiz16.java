package ch02.quiz_control;

import java.util.Scanner;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  제어문 실습문제 16번
 */

public class Quiz16 {
	public static void main(String[] args) {
		boolean run=true;
		int balance=0;
		
		Scanner sc=new Scanner(System.in);
		while(run){
			System.out.println("-----------------------------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-----------------------------------------");
			
			System.out.print("선택>>");
			int choice=sc.nextInt();
			
			if(choice==1){
				System.out.print("입금액>>");
				int inMoney=sc.nextInt();
				balance+=inMoney;
			}else if(choice==2){
				System.out.print("출금액>>");
				int outMoney=sc.nextInt();
				balance-=outMoney;
			}else if(choice==3){
				System.out.println("잔고>>" + balance);
			}else if(choice==4){
				System.out.println("프로그램 종료");
				break;				
			}
		}
		
		sc.close();
	}
}
