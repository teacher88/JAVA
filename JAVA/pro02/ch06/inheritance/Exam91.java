package ch06.inheritance;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  상속 - 함수재정의(Overriding)
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

public class Exam91 {
	public static void main(String[] args) {
		Shape line=new Line();
		line.draw();
				
		Shape rect=new Rect();
		rect.draw();
		
		Shape circle=new Circle();
		circle.draw();
	}
}
