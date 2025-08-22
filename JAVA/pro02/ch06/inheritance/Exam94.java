package ch06.inheritance;

/**
 * @Data : 
 * @Author : 강사
 * @Description : 상속 - 추상클래스, 추상함수 
 */

abstract class IParents{
	protected int x, y;
	
	public void msg(){
		System.out.println("hahahah");
	}
	
	public abstract void disp();
}
 
class ISon extends IParents{
	public void disp(){
		System.out.println("SonF class");
	}
}
 
class IDaughter extends IParents{
	public void disp(){
		System.out.println("DaughterF class");
	}
}
 
public class Exam94 {
	public static void main(String[] ar){
		IParents a=new ISon();
		a.disp();
		
		IParents b=new IDaughter();
		b.disp();
	}
}
 
