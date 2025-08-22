package ch06.robotAbstract;

public class StandardRobot extends Robot{
	public StandardRobot(String kind){
		super.kind=kind;
	}
	
	@Override
	public void actionFly(){
		System.out.println("날수 없습니다.");
	}
	
	@Override
	public void actionMisail(){
		System.out.println("미사일을 쏠수 있습니다.");
	}
	
	@Override
	public void actionKinfe(){
		System.out.println("목검을 가지고 있습니다.");
	}
}
