package thread06.Synchronized;

public class User2 extends Thread{
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		super.setName("User2");
		this.calculator = calculator;
	}

	@Override
	public void run() {
		calculator.setMoney(50);
	}
}


