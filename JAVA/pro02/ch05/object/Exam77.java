package ch05.object;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  클래스 - static변수, static함수
 */

class TestZ{
	private String name;
	private int don;
	private static float iyul;
	
	public TestZ(String name, int don, float iyul){
		this.name=name;
		this.don=don;
		TestZ.iyul=iyul;
	}
	
	public static void setIyul(float iyul){
		TestZ.iyul=iyul;
	}
	
	public void disp(){
		System.out.println("name:" + name);
		System.out.println("don:" + don);
		System.out.println("iyul:" + iyul);
		System.out.println("\n");
	}
}
 
public class Exam77 {
	public static void main(String[] ar){
		TestZ a=new TestZ("kim", 10000, 0.07f);
		a.disp();
		
		TestZ b=new TestZ("lee", 20000, 0.03f);
		b.disp();
		a.disp();
		
		TestZ.setIyul(0.09f);
		a.disp();
		b.disp();
	}
 }

