package ch07.interfaceB;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  상속 - interface
 */

public class BPhone implements Phone{

	@Override
	public void callSend() {
		System.out.println("가능합니다.");
	}

	@Override
	public void canData() {
		System.out.println("LTE 가능합니다.");	
	}

	@Override
	public void tvRemote() {
		System.out.println("리모컨 탑재 되어 있습니다.");
	}
}
