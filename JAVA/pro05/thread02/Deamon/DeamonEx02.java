package thread02.Deamon;

public class DeamonEx02 {
	public static void main(String[] args) {
		AutoSaveThread autoSave=new AutoSaveThread();
		autoSave.setDaemon(true);			// false
		autoSave.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println("���� �۾� ��!!!");
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

