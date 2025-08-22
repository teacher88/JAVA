package ch07.interfaceD;

/**
 * @Data : 
 * @Author : ����
 * @Description :   ��ü�� �Ű������� ���
 */

class Shape{
	public void draw(){
		System.out.println("Shape");
	}
}

class Line extends Shape{
	public void draw(){
		System.out.println("Line");
	}
}

class Rect extends Shape{
	public void draw(){
		System.out.println("Rect");
	}
}

class Circle extends Shape{
	public void draw(){
		System.out.println("Circle");
	}
}

public class Exam104 {
	public static void main(String[] args) {
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}

	public static void paint(Shape shape){
		shape.draw();
	}	
}
