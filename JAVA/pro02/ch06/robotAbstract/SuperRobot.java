package ch06.robotAbstract;

public class SuperRobot extends Robot{
	
	public SuperRobot(String kind){
		super.kind=kind;
	}
	
	@Override
	public void actionFly(){
		System.out.println("���� �ֽ��ϴ�.");
	}
	
	@Override
	public void actionMisail(){
		System.out.println("�̻����� ��� �ֽ��ϴ�.");
	}
	
	@Override
	public void actionKinfe(){
		System.out.println("���������� ������ �ֽ��ϴ�.");
	}
}
