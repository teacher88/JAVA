package ch07.interfaceA;

public class Television implements RemoteControl{      // ���� Ŭ����{
	private int volum;

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolum(int volum) {
		if(volum > MAX_VOLUME){
			volum=MAX_VOLUME;
		}else if(volum < MIN_VOLUME){
			volum=MIN_VOLUME;
		}
		
		this.volum=volum;
		System.out.println("���� TV ����:" + this.volum);
	}
}
