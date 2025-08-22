package ch06.inheritance;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� - �Լ�������(Overriding)
 */

class Airplane{
	public void fly(){
		System.out.println("�Ϲݺ����մϴ�.");
	}
	
	public void takeOff(){
		System.out.println("�̷��մϴ�.");
	}
	
	public void land(){
		System.out.println("�����մϴ�.");
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
			System.out.println("�����Ӻ����մϴ�.");
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
