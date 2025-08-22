package ch06.inheritance;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� - ������
 */

class CParents{
	protected int x;
	protected int y;
	
	public CParents(){
		System.out.println("�θ� �⺻ ������");
	}	
	
	public CParents(int x){
		this.x=x;
		this.y=20;
	}	
	
	public CParents(int x, int y){
		this.x=x;
		this.y=y;
	}
}
 
class CSon extends CParents{
	private int z;
	
	public CSon(){
	//	super();
		System.out.println("�ڽ� �⺻ ������");
	}
	
	public CSon(int x){
		// super(x);
		super();
		this.z=30;
	}
	
	public CSon(int x, int y, int z){
		super(x, y);
		this.z=z;
	}
	
	public void disp(){
		System.out.println("x:" + x + "\t y:" + y + "\t z:" + z);
	}
}
 
public class Exam85 {
	public static void main(String[] ar){
		CSon a=new CSon();
		CSon b=new CSon(10);
		CSon c=new CSon(100, 200, 300);
		
		b.disp();
		c.disp();	
	}
}
 
