package ch07.interfaceA;

/**
 * @Data : 
 * @Author : 강사
 * @Description : 상속 - interface
 */

public interface RemoteControl {
	// public static final 상수
	public int MAX_VOLUME=10;
	public int MIN_VOLUME=0;
	
	// public abstract 함수
	public void turnOn();
	public void turnOff();
	public void setVolum(int Volum);
}
