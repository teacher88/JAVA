package ch06.inheritance;

/**
 * @Data : 
 * @Author : ����
 * @Description :  ��� - �Լ�������(Overriding)
 */

class DParents{
	public void aa(){ }
	public void bb(){ }
	public void cc(){ }
	public void dd(){ }
	
	public void disp(){						// �Լ�������(Overriding), �Լ��ߺ�(Overloading, Overload)
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
