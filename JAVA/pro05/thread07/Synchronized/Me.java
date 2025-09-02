package thread07.Synchronized;

public class Me implements Runnable {

	public Toilet toilet;

	public Me(Toilet toilet){
		this.toilet=toilet;
	}
	
	@Override
	public void run(){
		toilet.openDoor(Thread.currentThread().getName());
	}
}
