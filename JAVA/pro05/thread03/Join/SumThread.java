package thread03.Join;

public class SumThread extends Thread{
	private long sum;
	
	public long getSum(){
		return sum;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=100;i++){
			sum+=i;
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("1~100 합:" + this.getSum());     // 좀 기달려야지 답 나옴
	}
}
