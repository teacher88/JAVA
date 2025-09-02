package thread09.Notify;

public class DataBox {				// ��������Ÿ(������ü)
	private String data;

	public synchronized void setData(String data) {
		if(this.data !=null){			// ������ �����带 �Ͻ� ������ ���·�
			try {
				wait(); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.data = data;
		System.out.println("ProducerThread ������ ����Ÿ :" + data);
		notify();						// �Һ��� ������
	}
	
	public synchronized String getData() {
		if(data==null){			// �Һ��� �����带 �Ͻ� ������ ���·�
			try {
				wait(); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// ������ ���鼭 ������ �Ѵ�.. ���� �ڼ��� ����
		String value=data;
		System.out.println("ConsumerThread �Һ��� ����Ÿ:" + value);
		data=null;
		notify();					// ������ ������
		
		return value;
	}

}
