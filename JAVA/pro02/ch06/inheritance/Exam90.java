package ch06.inheritance;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  상속 - 함수재정의(Overriding)
 */

class Airplane{
	public void fly(){
		System.out.println("일반비행합니다.");
	}
	
	public void takeOff(){
		System.out.println("이륙합니다.");
	}
	
	public void land(){
		System.out.println("착륙합니다.");
	}
}

class SupersonicAirplan extends Airplane{
	public static final int NORMAL=1;
	public static final int SUPERSONIC=2;
	private int flayMode=NORMAL;
	
	public void setFlayMode(int flayMode){
		this.flayMode=flayMode;
	}
		
	public void fly(){
		if(flayMode==SUPERSONIC){
			System.out.println("초음속비행합니다.");
		}else{
			super.fly();
		}
	}
}

public class Exam90 {
	public static void main(String[] args) {
		SupersonicAirplan sa=new SupersonicAirplan();
		sa.takeOff();
		sa.fly();
		
		sa.setFlayMode(SupersonicAirplan.SUPERSONIC);
		sa.fly();
		
		sa.setFlayMode(SupersonicAirplan.NORMAL);
		sa.fly();
		sa.land();
	}
}
