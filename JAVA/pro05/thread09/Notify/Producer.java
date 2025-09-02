package thread09.Notify;

public class Producer extends  Thread{     // 데이터를 생산(저장)하는 스레드
	private DataBox dataBox;
	
	public Producer(DataBox dataBox){
		this.dataBox=dataBox;					// 공유객체
	}
	
	@Override
	public void run() {
		for(int i=1;i<=3;i++){ 
			String data="Data"+i;
			dataBox.setData(data);			// 새로운 데이터 저장
		}
	}
}


