package api13.MVC.Bank;

/**
 * @Data : 
 * @Author : ����
 * @Description :  MVC - View
 */

import java.util.Scanner;

public class AccountView {
	public static void main(String[] ar){	
		AccountManager jbank=new AccountManager();
		
		Scanner sc=new Scanner(System.in);
		while(true){
			jbank.printMenu();
			System.out.print("����:");
			
			int choice=sc.nextInt();
			switch(choice){
			case 1:
				jbank.makeAccount();
				break;
			case 2:
				jbank.deposit();
				break;
			case 3:
				jbank.withdraw();
				break;
			case 4:
				jbank.inquire();
				break;
			case 5:
				jbank.disp();
				break;
			case 6:
				System.out.println("�����մϴ�.");
				sc.close();
				return;
			default:
				System.out.println("�߸������ϼ̽��ϴ�.");
			}
		}
	}
}



















