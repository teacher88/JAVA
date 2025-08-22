package ch07.interfaceC;

public class ESmartPhone extends DPDA implements BMobilePhone, CMP3{

	@Override
	public void sendCall() {
		System.out.println("전화걸기");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화받기");		
	}

	@Override
	public void play() {
		System.out.println("음악 재생");		
	}

	@Override
	public void stop() {
		System.out.println("재생 중지");
	}

	@Override
	public void sendSMS() {
		System.out.println("SMS 보내기");		
	}

	@Override
	public void receiveSMS() {
		System.out.println("SMS 받기");		
	}
	
	public void shedule(){
		System.out.println("일정관리");
	}
}
