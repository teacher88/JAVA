package ch06.robotAbstract;

public class LowRobot extends Robot{
	public LowRobot(String kind){
		super.kind=kind;
	}
	
	@Override
	public void actionFly(){
		System.out.println("���� �����ϴ�.");
	}
	
	@Override
	public void actionMisail(){
		System.out.println("�̻����� ��� �����ϴ�.");
	}
	
	@Override
	public void actionKinfe(){
		System.out.println("���� �����ϴ�.");
	}
}
