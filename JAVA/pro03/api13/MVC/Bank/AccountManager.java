package api13.MVC.Bank;

/**
 * @Data : 
 * @Author : ����
 * @Description :  MVC - Controller
 */

import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {
	private ArrayList<Account> list;
	private Scanner sc;
	
	public AccountManager(){
		list=new ArrayList<Account>();
		sc=new Scanner(System.in);
	}
	
	public void printMenu(){
		System.out.println("Menu------------");
		System.out.println("1.���°���");
		System.out.println("2.�Ա�");
		System.out.println("3.���");
		System.out.println("4.�ܾ���ȸ");
		System.out.println("5.��ü���");
		System.out.println("6.���α׷�����");
		System.out.println();
	}
	
	public void makeAccount(){
		Account account=new Account();
		
		System.out.print("���� ��ȣ:");
		account.setId(sc.nextInt());
		
		System.out.print("�̸�:");
		account.setName(sc.next());
		
		System.out.print("�Աݾ�:");
		account.setBalance(sc.nextLong());
		
		list.add(account);
		
		System.out.println("���°�  �����Ǿ����ϴ�.");
		System.out.println();
	}
	
	public void deposit(){
		System.out.print("���� ��ȣ:");
		int id=sc.nextInt();
		
		System.out.print("�Աݾ�:");
		long money=sc.nextLong();
		
		for(int i=0;i<list.size();i++){
			Account account=list.get(i);
			if(account.getId()==id){
				long balance=account.getBalance()+money;
				account.setBalance(balance);
				System.out.println("�ԱݿϷ� �Ǿ����ϴ�.");
				return ;
			}
		}
		System.out.println("��ȿ���� ����  ���¹�ȣ �Դϴ�.");
	}
	
	public void withdraw(){
		System.out.print("���� ��ȣ:");
		int id=sc.nextInt();
		
		System.out.print("��ݾ�:");
		long money=sc.nextLong();
		
		for(int i=0;i<list.size();i++){
			Account account=list.get(i);
			if(account.getId()==id){
				if(account.getBalance()< money){
					System.out.println("�ܾ׺��� �մϴ�.");
					return ;
				}

				long balance=account.getBalance()-money;
				account.setBalance(balance);
				System.out.println("��ݿϷ� �Ǿ����ϴ�.");
				return ;
			}
		}
		System.out.println("��ȿ���� ����  ���¹�ȣ �Դϴ�.");
	}
	
	public void inquire(){
		System.out.print("���� ��ȣ:");
		int id=sc.nextInt();
		
		for(int i=0;i<list.size();i++){
			Account account=list.get(i);
			if(account.getId()==id){
				System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
				return ;
			}
		}
		System.out.println("��ȿ���� ����  ���¹�ȣ �Դϴ�.");
	}
	
	public void disp(){
		for(int i=0;i<list.size();i++){
			Account account=list.get(i);
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
		}
	}
}






