package ch07.interfaceA;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  interface
 *                     1. 자바에서 인터페이스는 객체 사용 방법에 정의한 타입이다.
 *                     2. 다형성을 구현하는 매우 중요한 역할을 한다.
 *                     3. 인터페이스는 내부적으로 public static final상수와 public abstract 함수로 구성
 *                     4. 접근제한자는 public보다 더 낮은 접근제한으로 작성할 수 없다.
 *                     5. 8버전에서 default, static 메소드 추가 책 349~350
 */

interface XX{
	public int SU=20;	    	      // static final		
	public void disp();		 	 // abstract method
}
 
class YY implements XX{
	public void disp(){
		System.out.println("Hi");
	}
	
	public void output(){
		System.out.println("SU:" + SU);
		// SU=77;  error
	}
}

// interface Test extends XX { }
// interface Exam implements XX { }   이런 경우는 없음

public class Exam97 {
	public static void main(String[] ar){
		YY y=new YY();
		y.disp();
		y.output();
		System.out.println(YY.SU + "\n");
		
		XX x=new YY();
		x.disp();
		System.out.println(XX.SU);
	}
}
