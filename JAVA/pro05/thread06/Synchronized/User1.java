package thread06.Synchronized;

public class User1 extends Thread{
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		super.setName("User1");
		this.calculator = calculator;
	}

	@Override
	public void run() {
		calculator.setMoney(100);
	}
}
