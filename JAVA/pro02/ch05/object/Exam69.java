package ch05.object;

/**
 * @Data : 
 * @Author : ����
 * @Description :  Ŭ���� - this
 *                     Exam62~Exam69 ����, Ŭ����01 �ǽ����� 
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
