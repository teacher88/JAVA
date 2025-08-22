package ch07.interfaceA;

public class Audio implements RemoteControl{
	private int volum;

	@Override
	public void turnOn() {
		System.out.println("Audio¸¦ ÄÕ´Ï´Ù.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio ²ü´Ï´Ù.");
	}

	@Override
	public void setVolum(int volum) {
		if(volum > MAX_VOLUME){
			volum=MAX_VOLUME;
		}else if(volum < MIN_VOLUME){
			volum=MIN_VOLUME;
		}
		
		this.volum=volum;
		System.out.println("ÇöÀç ¿Àµð¿À º¼·ý:" + this.volum);
	}
}
