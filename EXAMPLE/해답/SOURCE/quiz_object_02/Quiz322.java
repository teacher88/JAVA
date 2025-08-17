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
		
		System.out.print("���¹�ȣ �Է�:");
		super.number=sc.nextInt();
		
		System.out.print("�̸��Է�:");
		super.name=sc.next();
		
		System.out.print("���°����Աݾ�:");
		super.balance=sc.nextLong();
		
		minus=50000;
	}
	
	public void withdraw(long money){	
		if(balance < money){		
			if(money > (minus+balance)) {
				System.out.println("�ѵ��� �ʰ� �Ͽ����ϴ�.");
			    return ;
			}
			System.out.println("�ܾ��� ���� �ϹǷ� ���̳ʽ� ���忡�� ����");
			
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
		System.out.println("�����ܾ�:" + balance);
	}
}

public class Quiz322 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		CheckingAccout account=new CheckingAccout();
	
		while(true){
			System.out.print("���ϴ� ��ȣ�� ��������(1.�Ա�, 2.���, 3.����) : ");
			int value=sc.nextInt();
			
			if(value==1){
				System.out.print("�Աݾ�:");
				long money=sc.nextLong();
				account.deposit(money);
				// account.disp();
			}else if(value==2){
				System.out.print("��ݾ�:");
				long money=sc.nextLong();
				account.withdraw(money);
			}else if(value==3){
				System.out.println("�����մϴ�.");
				sc.close();
				return ;
			}
		}
	}
}
