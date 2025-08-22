package ch07.interfaceA;

public class RemoteMain {
	public static void main(String[] args) {
		RemoteControl rc=null;
		rc=new Television();
		rc.turnOn();
		rc.setVolum(20);
		rc.turnOff();
		System.out.println();
		
		rc=new Audio();
		rc.turnOn();
		rc.setVolum(-10);
		rc.turnOff();
	}
}
