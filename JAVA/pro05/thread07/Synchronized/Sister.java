package thread07.Synchronized;

public class Sister implements Runnable {

	public Toilet toilet;

	public Sister(Toilet toilet){
		this.toilet=toilet;
	}
	
	@Override
	public void run(){
		toilet.openDoor(Thread.currentThread().getName());
	}
}


