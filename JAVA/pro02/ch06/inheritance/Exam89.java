package ch06.inheritance;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  상속 - 함수재정의(Overriding)
 */

class EParents{
	protected int x;
	protected int y;
	
	public EParents(){ }
	
	public EParents(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public void yonsan(){
		System.out.println("hap:" + (x+y));
	}
}

class ESon extends EParents{
	public ESon(){ }
	
	public ESon(int x, int y){
		super(x, y);
	}
	
	public void yonsan(){
		System.out.println("cha:" + (x-y));
	}
}
 
public class Exam89 {
	public static void main(String[] ar){
		EParents a=new EParents(20, 30);
		a.yonsan();
		
		ESon b=new ESon(10, 20);
		b.yonsan();
	}
}

