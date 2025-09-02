package thread09.Notify;

public class NotifyEx {
	public static void main(String[] args) {
		DataBox dataBox=new DataBox();
		
		Producer producer=new Producer(dataBox);
		
		Consumer consumer=new Consumer(dataBox);

		producer.start();
		
		consumer.start();
	
	}
}
