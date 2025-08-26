package api13.MVC.Bank;

/**
 * @Data : 
 * @Author : 강사
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
		System.out.println("1.계좌개설");
		System.out.println("2.입금");
		System.out.println("3.출금");
		System.out.println("4.잔액조회");
		System.out.println("5.전체출력");
		System.out.println("6.프로그램종료");
		System.out.println();
	}
	
	public void makeAccount(){
		Account account=new Account();
		
		System.out.print("계좌 번호:");
		account.setId(sc.nextInt());
		
		System.out.print("이름:");
		account.setName(sc.next());
		
		System.out.print("입금액:");
		account.setBalance(sc.nextLong());
		
		list.add(account);
		
		System.out.println("계좌가  개설되었습니다.");
		System.out.println();
	}
	
	public void deposit(){
		System.out.print("계좌 번호:");
		int id=sc.nextInt();
		
		System.out.print("입금액:");
		long money=sc.nextLong();
		
		for(int i=0;i<list.size();i++){
			Account account=list.get(i);
			if(account.getId()==id){
				long balance=account.getBalance()+money;
				account.setBalance(balance);
				System.out.println("입금완료 되었습니다.");
				return ;
			}
		}
		System.out.println("유효하지 않은  계좌번호 입니다.");
	}
	
	public void withdraw(){
		System.out.print("계좌 번호:");
		int id=sc.nextInt();
		
		System.out.print("출금액:");
		long money=sc.nextLong();
		
		for(int i=0;i<list.size();i++){
			Account account=list.get(i);
			if(account.getId()==id){
				if(account.getBalance()< money){
					System.out.println("잔액부족 합니다.");
					return ;
				}

				long balance=account.getBalance()-money;
				account.setBalance(balance);
				System.out.println("출금완료 되었습니다.");
				return ;
			}
		}
		System.out.println("유효하지 않은  계좌번호 입니다.");
	}
	
	public void inquire(){
		System.out.print("계좌 번호:");
		int id=sc.nextInt();
		
		for(int i=0;i<list.size();i++){
			Account account=list.get(i);
			if(account.getId()==id){
				System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
				return ;
			}
		}
		System.out.println("유효하지 않은  계좌번호 입니다.");
	}
	
	public void disp(){
		for(int i=0;i<list.size();i++){
			Account account=list.get(i);
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
		}
	}
}






