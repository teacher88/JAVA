package ch05.object;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  클래스 
 *                     알아두기) 클래스 3대 특징 은닉화(캡슐화), 다형성, 상속성
 *                     은닉화 예를 들어 TV의 중요한 부품이 바깥으로 노출되어 있다면, 사용자의 실수로 인해 고장날 수도 있다.
 *                     이런 중요한 부품은 TV 안쪽으로 캡슐화 하여 숨겨두어야 한다.            
 */

class Saram{
	public String name;
	public String address;
	public String phoneNumber;
	private String juminBunho;			
	public int age;
	
	public void setJuminBunho(String j){
		juminBunho=j;
	}
	
	public void disp(){
		System.out.println("이름:" + name);
		System.out.println("주소:" + address);
		System.out.println("전화번호:" + phoneNumber);
		System.out.println("주민번호:" + juminBunho);
		System.out.println("나이:" + age);
	}
}
 
public class Exam68 {
	public static void main(String[] ar){
		Saram a=new Saram();

		a.name="홍길동";
		a.address="서울시 강남구 역삼동";
		a.phoneNumber="010-1234-1234";
		a.age=23;

		a.disp();
	}
}
 
