package thread07.Synchronized;

public class Fater implements Runnable {

	public Toilet toilet;

	public Fater(Toilet toilet){
		this.toilet=toilet;
	}
	
	@Override
	public void run(){
		toilet.openDoor(Thread.currentThread().getName());
	}
}


