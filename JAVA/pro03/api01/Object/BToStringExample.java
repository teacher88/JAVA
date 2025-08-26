package api01.Object;


/**
 * @Data :
 * @Author : 강사
 * @Description : Object 클래스
 *                     toString() : 객체의 문자 정보를 리턴 한다.
 */

public class BToStringExample {
	public static void main(String[] args) {
		Integer a=new Integer(10);
		System.out.println("정수형을 문자열로 출력:" + a.toString());
		System.out.println(a + "\n");				// 객체명 출력시 내부적으로 toString() 호출해 준다.
		
		BSmartPhone andriod=new BSmartPhone("구글", "안드로이드");		
		 // toString() 오버로이드 하지 않으면 ch08_object.ToString@15db974
		System.out.println(andriod.toString());  
		System.out.println(andriod);
	}
}
