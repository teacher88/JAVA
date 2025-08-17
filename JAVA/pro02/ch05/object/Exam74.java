package ch05.object;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  클래스 - 생성자 중복
 */

class TestY{
	private int x, y, z;
	private int a;
	
	public TestY(){
		x=100;
		y=200;
		z=300;
		a=400;
	}
	
	public TestY(int x){
		// this.x=x;
		// y=200
		// z=300;
		// a=400;
		
		this();
		this.x=x;
	}
	
	public TestY(int x, int y){
		// this.x=x;
		// this.y=y;
		// z=300;
		// a=400;
		
		this(x);
		this.y=y;
	}
	
	public void disp(){
		System.out.println(x  + "\t" + y + "\t" + z);
		System.out.println(a);
		System.out.println();
	}
}
 
public class Exam74 {
	public static void main(String[] ar){
		TestY a=new TestY();
		a.disp();
		
		TestY b=new TestY(10);
		b.disp();
		
		TestY c=new TestY(50, 20);
		c.disp();
	}
}

