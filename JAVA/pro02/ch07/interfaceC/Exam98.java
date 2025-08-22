package ch07.interfaceC;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  interface - 다중상속
 *                     다음예문 FF, GG, HH, HMain
 */

interface AA{
	public void methodA();
}

class BB{
	public void methodC(){
		System.out.println("methodC() 실행");	
	}
}

interface Sub{
	public void methodB();
}

class DD extends BB implements AA, Sub{

	@Override
	public void methodA() {
		System.out.println("methodA() 실행");	
	}
	
	@Override
	public void methodB() {
		System.out.println("methodB() 실행");	
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
