package ch05.quiz01;

/**
 * @Data : 
 * @Author : ����
 * @Description :  Ŭ����1 - �ǽ����� 12)
 */

class Circle{
	public double radius;
	public double result;
	
	public void getRadius(double r){
		radius=r;
	}
	
	public void findArea(){
		result=radius*radius*3.14159;
	}
	
	public void disp(){
		System.out.println("���� ����:" + result);
	}
}

 
public class Quiz12 {
	public static void main(String[] args) {
		Circle c=new Circle();
		c.getRadius(4.0);
		c.findArea();
		c.disp();
	}
}
