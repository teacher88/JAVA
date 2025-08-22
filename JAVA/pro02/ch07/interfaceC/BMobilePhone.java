package ch07.interfaceC;

public interface BMobilePhone extends APhone {			// SMS 보내기, 받기
	
	public void sendSMS();
	
	public void receiveSMS();
}
