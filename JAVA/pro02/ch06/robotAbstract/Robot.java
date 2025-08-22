package ch06.robotAbstract;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  상속 - 추상클래스
 *                      시나리오 : 1) 로봇 모양은 팔, 다리, 머리, 몸통으로 이루어져 있습니다. 
 *                                   2) 로봇은 기본적으로 걷고, 달릴 수 있어야 합니다.
 *	                                 3) 로봇 종류에 따라 날수있으며, 미사일을 쏠 수 있고, 검을 가지고 있을 수 있습니다.
 *	                                 4) Super로봇은 날수 있고, 미사일을 쏠 수 있으며, 레이저 검을 가지고 있습니다.
 *                                   5) Standard 로봇은 날수는 없지만, 미사일을 쏠 수 있습니다. 목검은 가지고 있습니다.
 *	                                 6) Low 로봇은 날수도 없고, 미사일을 쏠 수도 없습니다. 검도 없습니다.
 */
public abstract class Robot {
	protected String kind;
		
	protected void shape(){
		System.out.println(kind + "는 팔, 다리, 몸통, 머리가 있습니다.");
	}
	
	protected void actionWalk(){
		System.out.println("걸을 수 있습니다.");
	}
	
	protected void actionRun(){
		System.out.println("달릴수 있습니다.");
	}
	
	protected abstract void actionFly();
	
	protected abstract void actionMisail();
	
	protected abstract void actionKinfe();
}
