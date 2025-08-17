package ch05.object;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  클래스 
 */

class Sub{
	public int x;
	public int y;
	
	public void setX(int a){
		x=a;
	}
	
	public void setY(int b){
		y=b;
	}
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	
	public void disp(){
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		System.out.println();
	}
}

public class Exam67 {
	public static void main(String[] ar){
		Sub a=new Sub();
		a.setX(10);
		a.setY(20);
		a.disp();
		
		System.out.println("x:" + a.getX());
		System.out.println("y:" + a.getY());
	}
}
