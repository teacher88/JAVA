package ch05.object;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  클래스 - this
 *                     Exam62~Exam69 이후, 클래스01 실습문제 
 */

class Data{
	private int x;
	private int y;
	
	public void setData(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public void disp(){
		System.out.println("x:" + x + "\t" + "y:" + y);
	}
}
 
public class Exam69 {
	public static void main(String[] ar){
		Data a=new Data();
		a.setData(10, 20);
		a.disp();
		
		Data b=new Data();
		b.setData(50, 60);
		b.disp();
	}
}
