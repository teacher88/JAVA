package ch06.inheritance;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  상속 - 생성자
 */

class BParents{
	protected int x;
	protected int y;
}
 
class BSon extends BParents{
	private int z;
	
	public BSon(){
		System.out.println("SonB() class");
		System.out.println();
	}
	
	public BSon(int x){
		super.x=x;
		super.y=20;
		this.z=30;
	}
	
	public BSon(int x, int y){
		super.x=x;
		super.y=y;
		this.z=300;
	}
	
	public BSon(int x, int y, int z){
		super.x=x;
		super.y=y;
		this.z=z;
	}
	
	public void disp(){
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		System.out.println("z:" + z);
		System.out.println();
	}
}
 
public class Exam84 {
	public static void main(String[] ar){
		BSon a=new BSon();
		BSon b=new BSon(10);
		BSon c=new BSon(100,200);
		BSon d=new BSon(50,60,70);
		
		a.disp();
		b.disp();
		c.disp();
		d.disp();
	}
}

