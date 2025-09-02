package thread06.Synchronized;

public class Calculator {					// 공유 클래스   money
	private int money;

	public int getMoney() {
		return money;
	}

public synchronized void setMoney(int money) {     // 임의 영역: 단 하나의 스레드만 실행
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



