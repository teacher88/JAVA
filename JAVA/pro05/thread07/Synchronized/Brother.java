package thread07.Synchronized;

public class Brother implements Runnable {

	public Toilet toilet;

	public Brother(Toilet toilet){
		this.toilet=toilet;
	}
	
	@Override
	public void run(){
		toilet.openDoor(Thread.currentThread().getName());
	}
}
