package ch05.object;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  클래스 - final변수, final함수
 */

class TestF{
	private final double PI=3.141592;
	public  static final int VALUE=20;
	
	public double getPi(){
		return PI;
	}
	
	public void setPi(double PI){
		// this.PI=PI; error
	}
	
	public static void bb(){ 
		int su=0;
		// su=PI;
		su=VALUE;
	}
	
	public static final void aa(){ }
}
 
public class Exam79 {
	public static void main(String[] ar){
		final int X=10;
		// X=20; error
		System.out.println("X:" + X);
		
		TestF a=new TestF();
		a.setPi(2.4);
		a.getPi();
		
		System.out.println();
		System.out.println(TestF.VALUE);
	}
}
