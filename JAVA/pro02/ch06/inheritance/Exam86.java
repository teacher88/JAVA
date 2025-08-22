package ch06.inheritance;

/**
 * @Data : 
 * @Author : 강사
 * @Description :  상속 - 생성자
 */

class Point{
	protected int x, y;
	
	public Point(){ }
	
	public Point(int x, int y){ 
		this.x=x;
		this.y=y;
	}
	
	public void showPoint(){
		System.out.println(x + "," + y);
	}
}

class ColorPoint extends Point{
	private String color;
	
	public ColorPoint(int x, int y, String color){
		super(x, y);
		this.color=color;
	}
	
	public void showColorPoint(){
		System.out.println(color);
		super.showPoint();
	}
}

public class Exam86 {
	public static void main(String[] args) {
		ColorPoint cp=new ColorPoint(5, 6, "blue");
		cp.showColorPoint();
	}
}
