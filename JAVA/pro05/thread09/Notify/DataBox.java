package thread09.Notify;

public class DataBox {				// 공유데이타(공유객체)
	private String data;

	public synchronized void setData(String data) {
		if(this.data !=null){			// 생산자 스레드를 일시 정지로 상태로
			try {
				wait(); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.data = data;
		System.out.println("ProducerThread 생산한 데이타 :" + data);
		notify();						// 소비자 실행대기
	}
	
	public synchronized String getData() {
		if(data==null){			// 소비자 스레드를 일시 정지로 상태로
			try {
				wait(); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// 번갈아 가면서 나오게 한다.. 문제 자세히 보기
		String value=data;
		System.out.println("ConsumerThread 소비한 데이타:" + value);
		data=null;
		notify();					// 생산자 실행대기
		
		return value;
	}

}
