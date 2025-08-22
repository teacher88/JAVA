package ch07.interfaceB;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  상속 - interface
 */

public class APhone implements Phone{

	@Override
	public void callSend() {
		System.out.println("가능합니다.");
	}

	@Override
	public void canData() {
		System.out.println("LTE 불가능합니다. 3G입니다.");
	}

	@Override
	public void tvRemote() {
		System.out.println("리모컨 미탑재 되었습니다.");
	}
}
