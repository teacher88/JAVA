package ch05.object;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  클래스 - 생성자 중복
 */

class TestC{
	private int x;
	private int y;
	
	public TestC(){
		x=10;
		y=20;
	}
	
	public TestC(int x){
		this.x=x;
		y=60;
	}
	
	public TestC(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public void disp(){
		System.out.println(x + "\t" + y);
	}
}
 
public class Exam73 {
	public static void main(String[] ar){
		TestC a=new TestC();
		TestC b=new TestC(10);
		TestC c=new TestC(77, 88);
		
		a.disp();
		b.disp();
		c.disp();
	}
}

