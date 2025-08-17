package ch05.quiz02;

import java.util.Scanner;

class Account{
	protected int number;
	protected String name;
	protected long balance;
	private int minus;
		
	public Account(){ }
	
	public void deposit(long money){		
		
		if(balance > 0){     // -1000
			System.out.println("OK1\t" + balance);
			balance +=money;
		}else if(balance == 0){
			System.out.println("OK2");
			long result=balance+money;
			balance=-result;
		}else if(balance < 0){
			System.out.println("OK3");
			minus=50000;

				long result=minus-(-balance+money);   
//				System.out.println("result" + result);
				balance=result;
//				System.out.println("result:" + -result);

		  // balance=-50000;
		   System.out.println("balance:" + -balance);
		}
	}
}

class CheckingAccout extends Account{
	private int minus;
	private Scanner sc;
	
	public CheckingAccout(){		
		sc=new Scanner(System.in);
		
		System.out.print("계좌번호 입력:");
		super.number=sc.nextInt();
		
		System.out.print("이름입력:");
		super.name=sc.next();
		
		System.out.print("계좌개설입금액:");
		super.balance=sc.nextLong();
		
		minus=50000;
	}
	
	public void withdraw(long money){	
		if(balance < money){		
			if(money > (minus+balance)) {
				System.out.println("한도액 초가 하였습니다.");
			    return ;
			}
			System.out.println("잔액이 부족 하므로 마이너스 통장에서 인출");
			
			if(balance >= 0){
				long result=(balance+minus)-money ;
				balance=-result;
			}else{
				balance-=-(money);
			}
			
		}else{
			balance-=money;
		}
		
		disp();
	}
	
	public void disp(){
		System.out.println("현재잔액:" + balance);
	}
}

public class Quiz322 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		CheckingAccout account=new CheckingAccout();
	
		while(true){
			System.out.print("원하는 번호를 누르세요(1.입금, 2.출금, 3.종료) : ");
			int value=sc.nextInt();
			
			if(value==1){
				System.out.print("입금액:");
				long money=sc.nextLong();
				account.deposit(money);
				// account.disp();
			}else if(value==2){
				System.out.print("출금액:");
				long money=sc.nextLong();
				account.withdraw(money);
			}else if(value==3){
				System.out.println("종료합니다.");
				sc.close();
				return ;
			}
		}
	}
}
