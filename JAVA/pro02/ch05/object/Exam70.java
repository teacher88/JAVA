package ch05.object;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  클래스 - 생성자
 */

class TestA{
	public TestA(){
		System.out.println("Hi");
	}
}
 
class TestB{
	public TestB(){
		System.out.println("How are you?");
	}
}
 
public class Exam70 {
	public static void main(String[] ar){
		TestA a=new TestA();
		TestA b=new TestA();
		
		TestB c=new TestB();
		TestB d=new TestB();
	}
}
