package ch06.inheritance;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  상속 - 함수재정의(Overriding)
 */

class DParents{
	public void aa(){ }
	public void bb(){ }
	public void cc(){ }
	public void dd(){ }
	
	public void disp(){						// 함수재정의(Overriding), 함수중복(Overloading, Overload)
		System.out.println("ParentsE class");
	}
}
 
class DSon extends DParents{
	public void disp(){
		System.out.println("SonE class");
	}
}
 
public class Exam88 {
	public static void main(String[] ar){
		DParents a=new DParents();
		a.disp();
		
		DSon b=new DSon();
		b.disp();
		
		DParents c=new DSon();		
		c.disp();
	}
}
