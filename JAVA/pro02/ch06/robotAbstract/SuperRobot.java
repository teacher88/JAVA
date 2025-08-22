package ch06.robotAbstract;

public class SuperRobot extends Robot{
	
	public SuperRobot(String kind){
		super.kind=kind;
	}
	
	@Override
	public void actionFly(){
		System.out.println("날수 있습니다.");
	}
	
	@Override
	public void actionMisail(){
		System.out.println("미사일을 쏠수 있습니다.");
	}
	
	@Override
	public void actionKinfe(){
		System.out.println("레이져검을 가지고 있습니다.");
	}
}
