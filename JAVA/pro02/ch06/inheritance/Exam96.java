package ch06.inheritance;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  상속 - final
 */

class HParents{
	protected int x=10;
	protected final int y=30;
	
	public void aa(){
		System.out.println("subA Testing");
	}
	
	public final void bb(){
		System.out.println("subB Testing");
	}
}
 
class HSon extends HParents{
	private int z=20;
	
	public void disp(){
		x=20;
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		System.out.println("z:" + z);
	}
	
	public void aa(){
		System.out.println("hi");
	}
	// public void bb(){ }  error
}
 
public class Exam96 {
	public static void main(String[] ar){
		HSon a=new HSon();
		a.disp();
	}
}

