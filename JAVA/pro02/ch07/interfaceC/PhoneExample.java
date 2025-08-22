package ch07.interfaceC;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  interface
 *                     IPhone_01, IMobilePhone_02, IMP3_03, PDA_04, SmartPhone_05
 */

public class PhoneExample {
	public static void main(String[] args) {
		ESmartPhone sp=new ESmartPhone();
		sp.sendCall();
		sp.receiveCall();
		System.out.println();
		
		sp.sendSMS();
		sp.receiveSMS();
		System.out.println();
		
		sp.play();
		sp.stop();
		
		int result=sp.calculate(3, 5);
		System.out.println("연산결과" + result);
		sp.shedule();
	}
}
