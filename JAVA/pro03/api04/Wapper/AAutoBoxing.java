package api04.Wapper;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  Wrapper 클래스 - 기본 타입(byte, char, short, int, long, float, double, boolean) 값을 포장하는 객체
 *                                               자동 Boxing, UnBoxing
 */

public class AAutoBoxing {
	public static void main(String[] args) {
		
		// 자동 Boxing
		Integer obj=100;
		System.out.println("obj:" + obj);
		
		// 대입시 자동  UnBoxing
		int value=obj;
		System.out.println("value:" + value);
		
		//  연산시 자동 UnBoxing
		int result=obj+100;						// 정확한 문법상의 오류지만 자동박싱에 의해 가능하다.
		System.out.println("result:" + ++result);
	}
}
