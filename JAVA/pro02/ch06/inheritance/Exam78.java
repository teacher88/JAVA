package ch06.inheritance;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  포함 오브젝트
 */

class AA{
	public int x, y;
}
 
class BB{
	AA a=new AA();
	public int z;
	public void disp(){
		System.out.println("x:" + a.x);
		System.out.println("y:" + a.y);
		System.out.println("z:" + z);
	}
}
 
public class Exam78 {
	public static void main(String[] ar){
		BB b=new BB();
		b.a.x=10;
		b.a.y=20;
		b.z=30;
		b.disp();
	}
}