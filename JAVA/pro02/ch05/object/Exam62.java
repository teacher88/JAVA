package ch05.object;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  클래스 - 멤버필드 및 객체선언
 */

class Su{
	public int x;    //  instance(member) variable, field
	public int y;
}
 
public class Exam62 {
	public static void main(String[] ar){
		Su a=new Su();
		a.x=10;
		a.y=20;
		System.out.println("a object:" + a.x + "\t" + a.y);
		
		Su b=new Su();
		b.x=100;
		b.y=200;
		System.out.println("b object:" + b.x + "\t" +  b.y);
	}
}







