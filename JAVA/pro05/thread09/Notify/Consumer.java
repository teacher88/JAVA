package thread09.Notify;

public class Consumer extends Thread{		// 데이터를 소비(읽는)하는 스레드
	private DataBox dataBox;
	
	public Consumer(DataBox dataBox){
		this.dataBox=dataBox;						// 공유객체
	}
	
	@Override
	public void run() {
		for(int i=0;i<=3;i++){
			dataBox.getData();						// 새로운데이타를 읽음
		}
	}
}


