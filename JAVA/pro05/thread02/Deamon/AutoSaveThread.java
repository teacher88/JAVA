package thread02.Deamon;

public class AutoSaveThread extends Thread{
	public void save(){
		System.out.println("�۾� ������ ������");
	}
	
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			save();
		}
	}
}
