package ch07.interfaceC;

/**
 * @Data : 
 * @Author : ����
 * @Description :  interface - ���߻��
 *                     �������� FF, GG, HH, HMain
 */

interface AA{
	public void methodA();
}

class BB{
	public void methodC(){
		System.out.println("methodC() ����");	
	}
}

interface Sub{
	public void methodB();
}

class DD extends BB implements AA, Sub{

	@Override
	public void methodA() {
		System.out.println("methodA() ����");	
	}
	
	@Override
	public void methodB() {
		System.out.println("methodB() ����");	
	}
}


public class Exam98 {
	public static void main(String[] ar){
		DD d=new DD();
		d.methodA();
		d.methodB();
		d.methodC();
	}
}
