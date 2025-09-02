package thread07.Synchronized;

public class Mother implements Runnable {

	public Toilet toilet;

	public Mother(Toilet toilet){
		this.toilet=toilet;
	}
	
	@Override
	public void run(){
		toilet.openDoor(Thread.currentThread().getName());
	}
}
