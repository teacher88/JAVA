package thread09.Notify;

public class Consumer extends Thread{		// �����͸� �Һ�(�д�)�ϴ� ������
	private DataBox dataBox;
	
	public Consumer(DataBox dataBox){
		this.dataBox=dataBox;						// ������ü
	}
	
	@Override
	public void run() {
		for(int i=0;i<=3;i++){
			dataBox.getData();						// ���ο��Ÿ�� ����
		}
	}
}


