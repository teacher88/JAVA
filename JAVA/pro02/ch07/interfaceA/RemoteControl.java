package ch07.interfaceA;

/**
 * @Data : 
 * @Author : ����
 * @Description : ��� - interface
 */

public interface RemoteControl {
	// public static final ���
	public int MAX_VOLUME=10;
	public int MIN_VOLUME=0;
	
	// public abstract �Լ�
	public void turnOn();
	public void turnOff();
	public void setVolum(int Volum);
}
