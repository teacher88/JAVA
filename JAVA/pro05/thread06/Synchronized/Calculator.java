package thread06.Synchronized;

public class Calculator {					// ���� Ŭ����   money
	private int money;

	public int getMoney() {
		return money;
	}

public synchronized void setMoney(int money) {     // ���� ����: �� �ϳ��� �����常 ����
// public  void setMemory(int money) {
		this.money = money;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() +":" + this.money);
	}
}



