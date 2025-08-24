package ch06.quiz;

abstract class Figure{
	public abstract void area();			// ����
	public abstract void around();		// �ѷ�
}

class Rectangular extends Figure{
	private double width;
	private double height;
	
	public Rectangular(double width, double height){
		this.width=width;
		this.height=height;
	}
	
	public void area(){
		System.out.println("�簢���� ����:" + (width * height));				// ����*����
	}
	
	public void around(){
		System.out.println("�簢���� �ѷ�:" + (2 * (width + height)));	
	}
}

class Circle extends Figure{
	private final double pi=3.141592;
	private double radius;
	
	public Circle(double radius){
		this.radius=radius;
	}
	
	public void area(){
		System.out.println("���� ����:" + (radius * radius * pi));				
	}
	
	public void around(){
		System.out.println("���� �ѷ�:" + (2  * radius * pi));	
	}
}

public class Quiz34 {
	public static void main(String[] args){
		Figure f=new Rectangular(2.3, 3.7);
		f.area();
		f.around();
		
		Figure i=new Circle(3.6);
		i.area();
		i.around();
	}
}
