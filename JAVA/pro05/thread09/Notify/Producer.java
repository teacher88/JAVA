package thread09.Notify;

public class Producer extends  Thread{     // �����͸� ����(����)�ϴ� ������
	private DataBox dataBox;
	
	public Producer(DataBox dataBox){
		this.dataBox=dataBox;					// ������ü
	}
	
	@Override
	public void run() {
		for(int i=1;i<=3;i++){ 
			String data="Data"+i;
			dataBox.setData(data);			// ���ο� ������ ����
		}
	}
}


