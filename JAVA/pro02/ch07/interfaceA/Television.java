package ch07.interfaceA;

public class Television implements RemoteControl{      // 구현 클래스{
	private int volum;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolum(int volum) {
		if(volum > MAX_VOLUME){
			volum=MAX_VOLUME;
		}else if(volum < MIN_VOLUME){
			volum=MIN_VOLUME;
		}
		
		this.volum=volum;
		System.out.println("현재 TV 볼륨:" + this.volum);
	}
}
