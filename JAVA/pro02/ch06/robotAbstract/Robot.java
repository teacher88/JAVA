package ch06.robotAbstract;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� - �߻�Ŭ����
 *                      �ó����� : 1) �κ� ����� ��, �ٸ�, �Ӹ�, �������� �̷���� �ֽ��ϴ�. 
 *                                   2) �κ��� �⺻������ �Ȱ�, �޸� �� �־�� �մϴ�.
 *	                                 3) �κ� ������ ���� ����������, �̻����� �� �� �ְ�, ���� ������ ���� �� �ֽ��ϴ�.
 *	                                 4) Super�κ��� ���� �ְ�, �̻����� �� �� ������, ������ ���� ������ �ֽ��ϴ�.
 *                                   5) Standard �κ��� ������ ������, �̻����� �� �� �ֽ��ϴ�. ����� ������ �ֽ��ϴ�.
 *	                                 6) Low �κ��� ������ ����, �̻����� �� ���� �����ϴ�. �˵� �����ϴ�.
 */
public abstract class Robot {
	protected String kind;
		
	protected void shape(){
		System.out.println(kind + "�� ��, �ٸ�, ����, �Ӹ��� �ֽ��ϴ�.");
	}
	
	protected void actionWalk(){
		System.out.println("���� �� �ֽ��ϴ�.");
	}
	
	protected void actionRun(){
		System.out.println("�޸��� �ֽ��ϴ�.");
	}
	
	protected abstract void actionFly();
	
	protected abstract void actionMisail();
	
	protected abstract void actionKinfe();
}
