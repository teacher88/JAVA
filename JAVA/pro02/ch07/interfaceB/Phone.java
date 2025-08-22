package ch07.interfaceB;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  상속 - interface
 * 	 					A전자에서 다양한 스마트폰을 만듭니다. 모델별 스펙은 아래와 같다.
 * 	 					제품명				전화송/수신      4G&3G&LTE		TV리모컨 기능
 * 	  						APhone				 가능				 3G				미탑재
 * 	  						BPhone	             가능             	 4G         		탑재
 * 	  						CPhone	             가능             	 4G         		미탑재 
 */

public interface Phone {				
	public void callSend();
	public void canData();
	public void tvRemote();
}
