package api01.Object;


/**
 * @Data : 
 * @Author : 강사
 * @Description :  Object 클래스
 *                      equals(Object obj) : 기본적으로 == 연산자와 동일한 결과를 리턴(번지 비교)
 *                      논리적 동등을 위해 오보라이딩 필요(논리적 동등 같은 객체이건 상관없이 객체가 저장하고 있는 데이터가 동일)
 */

public class AEqualsExample {
	public static void main(String[] args) {
		String name=new String("apple");
		String irum=new String("apple");
		
		String a="hi";
		String b="hi";
		
		System.out.println("String 주소값 비교:" + (name==irum));
		System.out.println("String 주소값 비교:" + (a==b));
		System.out.println("String 데이타값 비교:" + (name.equals(irum)) + "\n\n");  // String 클래스에서 Object 클래스의 equals 함수를 재정의 했음
		
		System.out.println("주소값 비교1:" + (a=="hi"));
		System.out.println("주소값 비교2:" + (name=="apple") + "\n\n");
	}
}











