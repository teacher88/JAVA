package ch07.interfaceC;

public class ESmartPhone extends DPDA implements BMobilePhone, CMP3{

	@Override
	public void sendCall() {
		System.out.println("��ȭ�ɱ�");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�ޱ�");		
	}

	@Override
	public void play() {
		System.out.println("���� ���");		
	}

	@Override
	public void stop() {
		System.out.println("��� ����");
	}

	@Override
	public void sendSMS() {
		System.out.println("SMS ������");		
	}

	@Override
	public void receiveSMS() {
		System.out.println("SMS �ޱ�");		
	}
	
	public void shedule(){
		System.out.println("��������");
	}
}
